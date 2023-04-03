package Database;
import java.sql.*;

public class connectiondatabase {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Testing","root","Welcome1964@");
			Statement stmt=con.createStatement();
			System.out.println("Inserting Records");
			String sql="Insert into testing values(43)";
			stmt.executeUpdate(sql);
			
			}catch(Exception e) {
				System.out.println(e);
			}
	}

}
