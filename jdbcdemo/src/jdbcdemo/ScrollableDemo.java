package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","dummy@2811");
			
	//Create Scrollable ResultSet
	stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	
	rs=stmt.executeQuery("select * from skills");
	
	while(rs.next())
    {
System.out.println(rs.getInt(1)+"  "+rs.getString(2));
    }
	
	System.out.println("*******Display Records from bottom to top*********");
	rs.afterLast();
	
	while(rs.previous())
    {
System.out.println(rs.getInt(1)+"  "+rs.getString(2));
    }
	
	System.out.println("******Display 3rd Record*********");
	rs.absolute(3);//move the cursor to third record
	System.out.println(rs.getInt(1)+"  "+rs.getString(2));
	System.out.println("******************************");

	
	System.out.println("******Display 2nd Record usinng relative method*********");
	rs.relative(2);//move the cursor to 2nd record
	System.out.println(rs.getInt(1)+"  "+rs.getString(2));
	System.out.println("******************************");

	System.out.println("******Display 1st Record usinng relative method*********");
	rs.first();//move the cursor to 2nd record
	System.out.println(rs.getInt(1)+"  "+rs.getString(2));
	System.out.println("******************************");

	System.out.println("******Display last Record usinng relative method*********");
	rs.last();//move the cursor to 2nd record
	System.out.println(rs.getInt(1)+"  "+rs.getString(2));
	System.out.println("******************************");

	rs.absolute(4);
	System.out.println("current cursor position:"+rs.getRow());
	
	
	rs.last();
	System.out.println("Total no of Records :"+rs.getRow());
	
	
	con.close();
		}
catch(Exception e){ 
            
            System.out.println(e);
            }  
	}

}
