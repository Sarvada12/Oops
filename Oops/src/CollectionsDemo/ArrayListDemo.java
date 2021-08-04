package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {

		//generic arraylist 
		ArrayList<String> a1=new ArrayList<String>();
		
		//add elements to array list
		a1.add("java");
		a1.add("perl");
		a1.add("rubi");
		a1.add("c++");
		a1.add("c# 5.0");
		
		System.out.println(a1);
		
		//get elements by index
		System.out.println("Elements at index 1 :"+a1.get(1));
		
		System.out.println("does list contain element java?:"+a1.contains("rubi"));
		
		
		//add elements at specific index
	a1.add(2,"oracle");
	System.out.println( a1);
	System.out.println("is array list empty :"+a1.isEmpty());
	System.out.println("Position of perl :"+a1.indexOf("perl"));
	System.out.println("size of arraylist :"+a1.size());
	
	Collections.sort(a1);
	System.out.println("Array list after sorting :"+a1);
	
	
	
	ArrayList <Integer> a2=new ArrayList<Integer>();
	a2.add(100);
	a2.add(400);
	a2.add(430);
	
	System.out.println(a2);
	System.out.println("size :"+a2.size());
	
	/*ArrayList<Float> a3=new ArrayList<Float>();
	a3.add( 85.23f);
	a3.add(87.50f);
	a3.add(55.67f);
	
	System.out.println(a3);*/
	
	
	}

}
