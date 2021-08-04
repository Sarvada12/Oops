package jdbcdemo;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionUtil {


	public static Connection CreateConnecton() throws Exception{	
		Class.forName("com.mysql.cj.jdbc.Driver");
      Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","dummy@2811");
       
        return con;
	
	}
}
