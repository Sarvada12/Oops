package newfeatures;

public class VariableArgumentsDemo {

	//takes string a 1st input parameter &followed by var args
	static void fun(String s,int ...a)
	{
		System.out.println("String passed :"+s);
	System.out.println("No of arguments passed :"+a.length);
	
	//for each loop to display var arugs
	for(int i :a)
	{
		System.out.println(i+" ");
	}
	
	
	}
	public static void main(String[] args) {

		fun("JDBC",100,200);
		fun("Swings",1,2,3,4,5,6,7,8);
		fun("MYsql");
		


	}

}
