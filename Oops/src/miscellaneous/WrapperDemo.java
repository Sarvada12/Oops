package miscellaneous;

public class WrapperDemo {

	public static void main(String[] args) {
		//create primitive DT
	int a=5;
	float b=28.34f;
	
	//convert into wrapper class
	
	//Integer aObj=new Integer(a);
	//Double bObj=new Double(b);
	
	
	//convert into wrapper class
	Integer aObj=a;//auto boxing-converting value type to wrapper class
	Float bObj=b;
	
	
	//create wrapper class object
	Integer x=Integer.valueOf(100);
	Double y=Double.valueOf(2000.02);
	
	//convert into primitive types 
	int p=x.intValue(); // Auto unboxing---converting objective to primitive
	double q=y.doubleValue();
	
	System.out.println(p+" "+q);
	System.out.println(aObj +"  "+bObj);
	
	char e='a';
	Character objE=e;
	System.out.println("objE");
	System.out.println(objE.isUpperCase(e));
	
	Double d= 200.55;
	Double objD=Double.valueOf(d);
	System.out.println(objD);
	System.out.println(Double.toHexString(d));
	System.out.println(Integer.toHexString(15));

	String hex="0xff";
	String oct="005";
	
	
	System.out.println(Integer.decode(oct));
	System.out.println(Integer.decode(hex));
	}

}
