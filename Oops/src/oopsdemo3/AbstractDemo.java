package oopsdemo3;

public class AbstractDemo {

	public static void main(String[] args) {
  Trainee t1=new Marks("Savi","Mumbai",1001,22);//upcasting
  
  
  t1.show();//invoke abstract bas class method
 double marks =t1.calculatorMarks();//invoking sub class method
  System.out.println(t1+" "+marks);
	}

}
