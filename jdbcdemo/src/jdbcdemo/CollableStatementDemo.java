package jdbcdemo;
import java.sql.*;
import java.util.Scanner;

class Skills
{
	Connection con;
    CallableStatement cstmt;
    ResultSet rs;
    Scanner scan;
   // int id;
    
    
	public Skills() throws Exception {
	con=ConnectionUtil.CreateConnecton();
	//scan=new Scanner(System.in);
	}
	
	public void getskills(int candidateId) throws Exception
	{
		cstmt=con.prepareCall("{ call get_candidate_skill(?)}");
		cstmt.setInt(1, candidateId);
		rs=cstmt.executeQuery();
		
		while (rs.next()) {
            System.out.println(String.format("%s - %s",
                    rs.getString("first_name") + " "
                    + rs.getString("last_name"),
                    rs.getString("skill")));
		
		
	}
    
		con.close();
	
	//getMycandidateskill();
}
public class CollableStatementDemo {

	public static void main(String[] args) {
		
		try {
			Skills s=new Skills();
			Scanner scan=new Scanner (System.in);
			System.out.println("Enter candidate Id :");
			int id=scan.nextInt();
			
			s.getskills(id);
			scan.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

		
	}
	
		
	}
	
}

