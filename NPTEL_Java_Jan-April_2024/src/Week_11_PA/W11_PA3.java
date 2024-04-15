package Week_11_PA;

//Fix bugs in the code, DO NOT ADD or DELETE ANY LINE
import java.sql.*;
import java.util.Scanner;

public class W11_PA3 {
	public static void main(String args[]) {
		try {
				Connection conn = null;
				Statement stmt = null;
				String DB_URL = "jdbc:sqlite:/tempfs/db";
				System.setProperty("org.sqlite.tmpdir", "/tempfs");
				conn = DriverManager.getConnection(DB_URL);
				conn.close();
				System.out.print(conn.isClosed());
           
				//Private test case
				Scanner sc = new Scanner(System.in);
				int s = sc.nextInt();
				if (s == 6) {
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