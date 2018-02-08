package jdbcapp;

//Step 1: Import required packages
import java.sql.*;

public class JDBCApp {
    /**
     * @param args the command line arguments
     */
    public static void retriveBookDetails(String title) throws ClassNotFoundException, SQLException {
        // Step 2: Load & Register the JDBC Driver class
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); // load the class in JVM
        
        // Step 3: Open a connection to the database
        String conString="jdbc:ucanaccess://C:\\Users\\Parth\\Google Drive\\2018\\Advanced Java Technology - B.Tech VI\\H. Lecture Notes\\Demo Programs\\JDBC\\LibraryManagementSystem.mdb;memory=true\"";
        Connection connection = DriverManager.getConnection(conString,"username", "password");
        
        // Step 4: Create a statement object & the query
        String query = "SELECT * FROM Book WHERE title = '"+title+"'";
        Statement s = connection.createStatement();

        query = "SELECT * FROM Book WHERE title =?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, title);
        // Step 5: Execute the statement and return the result
        //ResultSet rs = s.executeQuery(query);
        
        ResultSet prs = ps.executeQuery();
       
        // Step 6: Process the results
        //rs.next();
        while(prs.next()){
            System.out.print(prs.getString("Title") +", " + prs.getString("author")+", " + prs.getInt("price"));
            System.out.println();
        }

        // Step 7: Close the Statement object
        //rs.close();
        prs.close();
        s.close();
        
        // Step 8: Close the connection 
        connection.close();
    }
    
    public static Connection getBankDBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String conString="jdbc:ucanaccess://C:\\Users\\Parth\\Google Drive\\2018\\Advanced Java Technology - B.Tech VI\\H. Lecture Notes\\Demo Programs\\JDBC\\BankManagementSystem.accdb;memory=true\"";
        Connection connection = DriverManager.getConnection(conString);
        return connection;
    }
    
    public static Connection getBooksDBConnection() throws ClassNotFoundException, SQLException{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String conString="jdbc:ucanaccess://C:\\Users\\Parth\\Google Drive\\2018\\Advanced Java Technology - B.Tech VI\\H. Lecture Notes\\Demo Programs\\JDBC\\LibraryManagementSystem.mdb;memory=true\"";
            Connection connection = DriverManager.getConnection(conString);
            return connection;
    }
}
