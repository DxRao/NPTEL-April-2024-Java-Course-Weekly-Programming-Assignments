package Week_11_PA;

import java.sql.*;

public class W11_PA5 {
    
	public static void main(String args[]) throws SQLException {
        
		try {
              Connection conn = null;
              Statement stmt = null;
              
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
              
              // The statement containing SQL command to create table "STUDENTS"
              String CREATE_TABLE_SQL="CREATE TABLE STUDENTS (UID INT, Name VARCHAR(45), Roll VARCHAR(12), Age INT);";
              
              // Execute the statement containing SQL command
              stmt.executeUpdate(CREATE_TABLE_SQL);
              String query = "ALTER TABLE Students RENAME TO GRADUATES;";

              stmt.executeUpdate(query);
              DatabaseMetaData metaData = conn.getMetaData();
              ResultSet tables = metaData.getTables(null, null, "%", null);

              while (tables.next()) {
            	  String tableName = tables.getString("TABLE_NAME");
            	  System.out.print("TABLE NAME = "+tableName);
              }

              tables.close();
        }
        catch(Exception e){ 
        	
        	System.out.println(e);
        }  
    }
}