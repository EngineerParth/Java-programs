
package jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Parth
 */
public class BankApp {
    public void fundTransfer(int fromAccNum, int toAccNum, double amount) throws ClassNotFoundException, SQLException{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String conString="jdbc:ucanaccess://C:\\Users\\Parth\\Google Drive\\2018\\Advanced Java Technology - B.Tech VI\\H. Lecture Notes\\Demo Programs\\JDBC\\BankManagementSystem.accdb;memory=true\"";
        Connection connection = DriverManager.getConnection(conString);
         connection.setAutoCommit(false);
         connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
         try{
            // withdraw 7500 from account no 1001
            String query1 = "UPDATE AccountData SET balance=22500 WHERE accountNo='"+fromAccNum+"'";
            Statement s1 = connection.createStatement();
            // Deposite 7500 in accoun no 1005
            String query2 = "UPDATE AccountData SET balance=63800 WHERE accountNo='"+toAccNum+"'";
            Statement s2 = connection.createStatement();
            int n1 = s1.executeUpdate(query1);
            System.out.println("Amount withdrawn from account no: "+fromAccNum+"...");
            int n2 = s2.executeUpdate(query2);
            System.out.println("Amount deposited to account no: "+toAccNum+"...");
            connection.commit();
            System.out.println("Transfer successful.");
            } catch(SQLException se){
                try {
                    connection.rollback();
                    System.out.println("Transfer failed!");
                } catch (SQLException ex) {
                    Logger.getLogger(BankApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    
    public void addAnnualInterest() throws ClassNotFoundException, SQLException{
        Connection connection = JDBCApp.getBankDBConnection();
        String query = "SELECT accountNo, balance FROM AccountData";
        Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet balances = s.executeQuery(query);
        
        String query1 = "UPDATE AccountData SET balance = ? WHERE accountNo = ? ";
        PreparedStatement ps1 = connection.prepareStatement(query1);

       // System.out.println(balances.getRow());
        while(balances.next()){
            int tempBal = balances.getInt(2);
            System.out.println(tempBal);
            int updatedBal = (int)(tempBal*1.1);
            ps1.setInt(1, updatedBal);
            ps1.setInt(2, balances.getInt(1));
            ps1.addBatch();
        }
        int[] status = ps1.executeBatch();
        for(int i : status){
            if(i == PreparedStatement.EXECUTE_FAILED){
                throw new SQLException("Entry "+i+" failed to execute in the batch");
            }
        }
        balances.close();
        s.close();
        ps1.close();
        connection.close();
    }
    
    public void addAnnualInterest(double persent) throws ClassNotFoundException, SQLException{
        Connection con = JDBCApp_1.getConnection(ConnParameters.bankConString);
        double normalized = persent/100;
        String query = "UPDATE AccountData SET balance = balance*"+(1+normalized);
        Statement s = con.createStatement();
        int n = s.executeUpdate(query);
        s.close();
        con.close();
    }
    
    public static void main(String[] s) throws ClassNotFoundException, SQLException{
        BankApp bank1 = new BankApp();
        bank1.fundTransfer(1001, 1005, 7500.00);
    }
}
