package newfeatures;

import java.util.ArrayList;
import java.util.List;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> lp1=new ArrayList<Product>();
		lp1.add(new Product(101,"Apple Laptop",35000f));
		lp1.add(new Product(102,"HP Laptop",55000f));
		lp1.add(new Product(103,"DELL Laptop",45000f));
		lp1.add(new Product(104,"ACER Laptop",95000f));
		lp1.add(new Product(105,"SOny Laptop",115000f));

		System.out.println("Laptop price Greater than 50000");
		lp1.stream().filter(p ->p.price>50000)
		.forEach(p ->System.out.println(p.name));
		
		//Iterater in a arraylist
		System.out.println("*******Display Product**********");
		lp1.stream()
		.forEach(p ->System.out.println(p.id+ " "+p.name+" "+p.price));
		
	}

}
