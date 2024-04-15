package Week_11_PA;

import java.sql.*;
import java.util.Scanner;

public class W11_PA1 {
    
	public static void main(String args[]) {
        
		try {
            
			Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
            // JDBC Codes in the hidden section

            // Open a connection
            conn = DriverManager.getConnection(DB_URL);
            
            System.out.print(conn.isValid(1));
            // conn.close();
            
            // take input from the user
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            
            if (s == 1) {
                //conn.close();
                System.out.print(conn.isValid(1));
            }
            // Close the connection
            conn.close();
            // JDBC Codes in the visible section
		} 
		catch (Exception e) {
			
            System.out.println(e);
        }
    }
}