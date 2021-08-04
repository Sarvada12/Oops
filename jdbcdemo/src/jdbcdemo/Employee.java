package jdbcdemo;
import java.sql.*;

public class Employee {

	Connection con;
    PreparedStatement stmt;
    Statement st;
    ResultSet res;
   
    public Connection getConnection() throws Exception
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","dummy@2811");
    	return con;
    }
    
    public void insertEmployee(String name, String city, String contact)
    {
    	int rest=0;
    	System.out.println("****** Insert new Employees*******");
    	try
    	{
    		con=getConnection();
    		stmt=con.prepareStatement("INSERT INTO employee (name, City, Contact) VALUES (?,?,?)");
    		
    		
    		
    		stmt.setString(1, name);
    		System.out.println(name);

    		stmt.setString(2, city);
    		System.out.println(city);

    		stmt.setString(3, contact);
    		System.out.println(contact);

    		rest=stmt.executeUpdate();
    		if(rest==1)
    		{
    			System.out.println("Employee Save Succesfull");
    		}
    		else
    		{
    			System.err.println("Input are invalid");
    		}
    		con.close();
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
    
    public void getEmployee()
    {
    	System.out.println("****** Display Employees*******");
    	try
    	{
    		con=getConnection();
        	stmt=con.prepareStatement("select * from employee");
        	res=stmt.executeQuery();
        	while(res.next())
        	{
        		System.out.println(res.getInt("EMPID")+"\t"+res.getString("name")+"\t"+res.getString("CITY")+"\t"+res.getString("CONTACT"));
        	}
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	
    }
	
    public void updateEmployee(int empid,String city)
    {
    	int rest=0;
    	System. out.println("****** Update Employees*******");
        try
        {
        	con=getConnection();
        	stmt=con.prepareStatement("UPDATE employee SET city=? WHERE empid=?");
        	stmt.setString(1, city);
        	stmt.setInt(2, empid);
        	rest=stmt.executeUpdate();
        	if(rest==1)
        	{
        		System.out.println("Employee city Updated");
        	}
        	else
        	{
        		System.err.println("Employee id is incorrect");
        	}
        	con.close();
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
    }
    
    public void deleteEmployee(int cid)
    {
    	boolean rest=false;
    	System. out.println("****** Delete Employees*******");
        try
        {
            con=getConnection();
            stmt=con.prepareStatement("DELETE FROM employee WHERE empid=?");
            stmt.setInt(1, cid);
            rest=stmt.execute();
            if(rest==false)
            {
            	System.out.println("Employee deleted successfull");
            }
            else
            {
            	System.err.println("Id is incorrect");
            }
            con.close();
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
    }

	
}