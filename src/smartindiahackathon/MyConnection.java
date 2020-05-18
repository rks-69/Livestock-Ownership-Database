
package smartindiahackathon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection 
{
	static Connection con;
	
	static Connection connect()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Ok");
			con=DriverManager .getConnection("jdbc:mysql://localhost:3306/prateek","root","asdf");
			System.out.println("Connected");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return con;
	}

	public static void main(String[] args) 
	{
		connect();

	}

}
