package Week_11_PA;

import java.sql.*;

public class W11_PA4 {
    
	public static void main(String args[]) {
        
		try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
              String query = "create table students(UID int, Name Varchar(12), Roll Varchar(12), Age int)";

              stmt.executeUpdate(query);
              ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTS;");
              ResultSetMetaData rsmd = rs.getMetaData();
              
              System.out.println("No. of columns : " + rsmd.getColumnCount());
              System.out.println("Column 1 Name: " + rsmd.getColumnName(1));
              System.out.println("Column 1 Type : " + rsmd.getColumnTypeName(1));
           	  System.out.println("Column 2 Name: " + rsmd.getColumnName(2));
              System.out.println("Column 2 Type : " + rsmd.getColumnTypeName(2));
              System.out.println("Column 3 Name: " + rsmd.getColumnName(3));
              System.out.println("Column 3 Type : " + rsmd.getColumnTypeName(3));
              System.out.println("Column 4 Name: " + rsmd.getColumnName(4));
              System.out.print("Column 5 Type : " + rsmd.getColumnTypeName(4));
              stmt.close();
              conn.close();
        }
        catch(Exception e){ 
        	
        	System.out.println(e);
        }  
    }
}
