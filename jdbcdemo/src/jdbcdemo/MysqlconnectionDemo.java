package jdbcdemo;

import java.sql.*;

public class MysqlconnectionDemo {

	public static void main(String[] args) {
		
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		try {
			//Load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create a connection getConnection of DM class
		//Create a connection between jdbc and mysql
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","dummy@2811");
		
		//creating statement object
		stmt=con.createStatement();
		
		//execute query & store in resultset
		rs=stmt.executeQuery("select * from employees");
		
		//Traverse in resultset
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ " "+rs.getString(3)+ " "+rs.getString(5)+ " "+rs.getString(8));
		}
		
		/*System.out.println("Display Specific record from a db");
		
		rs.absolute(3);
		System.out.println(rs.getInt(1)+ " "+rs.getString(3)+ " "+rs.getString(5)+ " "+rs.getString(8));

*/
		con.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
		
		
	}

}
