
package jdbcapp;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Parth
 */
public class BooksApp {
    public static void main(String[] s) throws ClassNotFoundException, SQLException{
        System.out.println("Enter title of the book:");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        JDBCApp.retriveBookDetails(title);
    }
}
