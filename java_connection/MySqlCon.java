import java.sql.*;  
import java.util.*;


class MySqlCon {  
	public static void main(String args[]){  
		
		System.out.println("JDBC Connectivity With Cryptdb");

		try {  
			Class.forName("com.mysql.jdbc.Driver");  

			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/test","root","letmein");  
			//here test is database name, letmein is username and password  

			Statement stmt=con.createStatement();  

			//stmt.executeUpdate("insert into test values('prakhar','verma')"); 
			ResultSet rs=stmt.executeQuery("SELECT *from test");  
			
			while(rs.next())  
				System.out.println(rs.getString(1)+"  "+rs.getString(2)); 
			con.close();  
		} catch(Exception e){ 
			System.out.println(e);
		}  
	}  
} 

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

class MySqlCon {

	private static String user ="root";
	private static String password = "letmein";
	private static Connection con=null;
	private static Statement st=null;
	private static ResultSet rs=null;

	public static void main(String args[])throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/test", user, password);

		}

		catch (Exception e) {
			System.out.println("e");
		}

		try{

			st=con.createStatement();
			rs=st.executeQuery("select * from test");

			while(rs.next()) {
				System.out.println(rs.getString("name") + " " +rs.getString("email"));
			}

		}

		finally {
			try {
				if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}

			}
			catch (SQLException e) {
				System.out.println(e);
			}

		}

	}

}*/
