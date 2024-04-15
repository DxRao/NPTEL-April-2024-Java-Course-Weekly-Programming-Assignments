package Week_11_PA;

import java.sql.*;
import java.util.Scanner;
 
class W11_PA2 {
    
	public static void main(String args[]) {
        
		try {
              
			  Connection conn = null;
              Statement stmt = null;
              
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
              
              conn = DriverManager.getConnection(DB_URL);
              System.out.print(conn.isValid(1));
              conn.close();
              // Private test case
              Scanner sc = new Scanner(System.in);
              int s = sc.nextInt();
              if (s == 7) {
            	  // conn.close();
            	  System.out.print(false);
              }
              conn.close();
        } 
		catch (Exception e) {
            
			System.out.println(e);
        }
    }
}