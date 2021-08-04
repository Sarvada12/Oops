package jdbcdemo;

import java.sql.*;
import java.util.Scanner;

public class EmployeeCRUD1 {
	public static void main(String[] args) {
		
		Employee e=new Employee();
		String name=null,city=null,contact=null;
		int id=0;
		
		System.out.println("***** Global Tech Solutions *****");
		System.out.println("----------- Employee Management System ----------");
		while(true)
		{
			System.out.println("Press 1 for New Employee \t Press 2 to Display Employees");
			System.out.println("Press 3 for Update Employee \t Press 4 to Delete Employee");
			System.out.println("Press 5 for Exit"); 
				
			Scanner s1=new Scanner(System.in);
			int option=s1.nextInt();
			
			switch(option)
			{
			case 1: 
				System.out.println("Enter Customer Name, City & Contact no :");
				
				System.out.println(" Name: ");
				s1.nextLine();
				name=s1.nextLine();
				System.out.println("City: ");
				city=s1.nextLine();
				System.out.println(" Contact no.: ");
				contact=s1.nextLine();
				System.out.println(name+" "+city+" "+contact);
				e.insertEmployee(name,city,contact);
				break;
					
			case 2: e.getEmployee();
					break;
					
	
					
			case 3: System.out.println("Enter Employee Id & City to be Updated:");
			System.out.println("Enter employee id");
		
			id=s1.nextInt();
			s1.nextLine();
			System.out.println("Enter employee city: ");
			city=s1.nextLine();
			e.updateEmployee(id,city);
			break;
					
			case 4: System.out.println("Enter Employee Id  to be Deleted:");
			System.out.println("Enter employee id: ");
					id=s1.nextInt();
					e.deleteEmployee(id);
					break;
			case 5:System. out.println("Application Terminated");
			System.exit(0);

	
			default:System. out.println("Invalid Selection");
	          break;
			}
		}
	}

	
}