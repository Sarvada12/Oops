package CollectionsDemo;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.push("Mike");
		s.push("mira");
		s.push("Mina");
		s.push("Mayuri");
		s.push("Mikka");
		
		System.out.println("Remove elements :"+s.pop());
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println("Elements on Top:"+s.peek());
		System.out.println("search Mike:"+s.search("Mike")); 

	}

}
