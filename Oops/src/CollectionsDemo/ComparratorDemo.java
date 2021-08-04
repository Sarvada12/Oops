package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparratorDemo {

	public static void main(String[] args) {

		ArrayList<Developer> a1=new ArrayList<Developer>();
		
		
	    Developer d1=new Developer(103,"Mike","Java");
	        Developer d2=new Developer(105,"Mary","Dot Net");
	        Developer d3=new Developer(101,"Ravi","Angular");
	        Developer d4=new Developer(102,"Hary","Php");
	        Developer d5=new Developer(104,"Navin","Oracle");
	
	a1.add(d5);a1.add(d4);a1.add(d3);a1.add(d2);a1.add(d1);
	
	System.out.println("***********Un Sorted*******");
	
	for(Developer i:a1)
	{
		System.out.println(i.getId()+" "+i.getName()+""+i.getDomain());
	
	
	}
	
	//sort by id
	Collections.sort(a1,new IdComparator());
	
	System.out.println("_-----Sort by Id---");
	for(Developer i:a1)
	{
		System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
		
	}
	//sort by domain
	
Collections.sort(a1,new DomainComparator());
	
	System.out.println("_-----Sort by Domain---");
	for(Developer i:a1)
	{
		System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
		
	}
	}

}
