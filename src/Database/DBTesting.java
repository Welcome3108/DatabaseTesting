package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTesting {

	public static void main(String[] args) throws SQLException {
		
	 Connection connection = DriverManager.getConnection("jdbc:mysql://gurumavin-db.cuc96kgqjvyi.us-west-1.rds.amazonaws.com:3306/GuruMavin","admin","gurumavindata11");
	 
	 if( connection.isClosed()) {
		 System.out.println("We have not connected to database");
	 }
	 
	 else {
		 System.out.println("We have successfully connected to the Database");
	 }
		
		
	}

}
