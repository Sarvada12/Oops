package MapDemo;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {

		
		HashMap<String,Double> hm=new HashMap<String,Double>();
		

		hm.put("John", 200.10);
		hm.put("ron", 500.201);
		hm.put("Janny", 486.140);
		hm.put("sanny", 2480.10);
		hm.put("vrush", 4515.10);
		hm.put("ash", 7613.55);
		
		
		 System.out.println("Display customers : ");
		    for(String k:hm.keySet())
		    {
		    	System.out.println(k+"-->"+hm.get(k));
		    	
		    }
		    
		    //deposite 1000 to jim's account 
		    double bal=hm.get("sanny");
		    hm.put("sanny", bal+1000);
		    System.out.println("sanny new balance"+hm.get("sanny"));
		    
		    hm.putIfAbsent("Raj", 5000.2);
		    System.out.println(hm);
		    
		    Scanner s=new Scanner (System.in);
		    System.out.println("Enter customer name :");
		    String name=s.next();
		    System.out.println("The balance of"+name+"is :"+hm.get(name));
		    
	}

}
