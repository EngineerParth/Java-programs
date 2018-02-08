/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcapp;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Parth
 */
public class BooksAppMetadata {
    public static void main(String[] s) throws ClassNotFoundException, SQLException{
        Connection con = JDBCApp.getBooksDBConnection();
        DatabaseMetaData metadata = con.getMetaData();
        System.out.println("User Name: "+metadata.getUserName());
        System.out.println("Product Name: "+metadata.getDatabaseProductName());
        System.out.println("Product Version: "+metadata.getDatabaseProductVersion());
        System.out.println("URL: "+metadata.getURL());
        System.out.println("Driver Name: "+metadata.getDriverName());
        System.out.println("Driver Version: "+metadata.getDriverVersion());
        System.out.println("Tables:");
        ResultSet rs = metadata.getTables(null, null, null, new String[]{"TABLE"});
        while(rs.next()){
            String tableName = rs.getString("TABLE_NAME"); 
            String scheme = rs.getString("TABLE_SCHEM");
            String catalog = rs.getString("TABLE_CAT"); 
            
            System.out.println("Scheme: "+scheme);
            System.out.println("Catalog: "+catalog);
            
            ResultSet primaryKeys = metadata.getPrimaryKeys(null, null, tableName);
            while(primaryKeys.next()){
                System.out.println("Primary Key: "+primaryKeys.getString("COLUMN_NAME"));
            }
        }
        
    }
}
