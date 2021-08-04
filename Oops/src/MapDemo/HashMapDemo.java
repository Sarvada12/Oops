package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//hashmap declaration with key value pairs
HashMap<Integer,String> hmap =new HashMap<Integer,String>();
	
	//add elements to hash map
hmap.put(12,"Ravi");
hmap.put(11,"savi");
hmap.put(10,"Raj");
hmap.put(18,"kavi");
hmap.put(17,"Roi");

//Display contain using iterator
Set s=hmap.entrySet();
Iterator itr=s.iterator();
System.out.println(s);
while(itr.hasNext())
{
	Map.Entry mentry= (Map.Entry) itr.next();
	System.out.println(mentry.getKey()+" --->"+mentry.getValue());
	}
Set s1=hmap.keySet();
System.out.println(s1);

System.out.println("***************key set*************");

Iterator itr1=s1.iterator();
while(itr1.hasNext())
{
Integer key=(Integer) itr1.next();
	String value=hmap.get(key); 
	System.out.println(key+"----  "+value);
	
}

//get values based on key
String name=hmap.get(10);
System.out.println("The name with key 10 is :"+name);

//remove values based on key
hmap.remove(12);
System.out.println(hmap);
	}

}
