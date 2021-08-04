package CollectionsDemo;

import java.util.HashSet;
import java.util.Set;

//hashset with userdefined objects

public class HashSetDemoUserDefined {

	public static void main(String[] args) {
	
		Set<Customer> customers = new HashSet<Customer>();
		
		//add new cust obj to set
	customers.add(new Customer(101,"Arun","Bengaluru"));
	customers.add(new Customer(102,"Mike","Sydney"));
	customers.add(new Customer(103,"Andy","Newyork"));
	customers.add(new Customer(104,"John","Delhi"));
	customers.add(new Customer(105,"Hari","Mumbai"));
	
	//add duplicate
	/*
    HashSet will use the `equals()` & `hashCode()` implementations 
    of the Customer class to check for duplicates and ignore them
  */

	customers.add(new Customer(104,"John","Delhi"));
	for(Customer i :customers)
	{
		System.out.println(i.getId()+" "+i.getName()+" "+i.getCity());
	}
	
	}

}