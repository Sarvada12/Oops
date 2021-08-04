package newfeatures;
//@Functionalinterface
interface MyFunctionaInterface
{
	public String sayHello();
	
	}
interface MyFunctionaInterface1
{
	public int incrementbyFive(int a);
	
	}
interface StringConcat
{
	public String sconcat(String a,String b);
	}
public class LambdaExpressionsDemo {

	public static void main(String[] args) {

		//Lamba Expression with no parameter
	MyFunctionaInterface msg=()-> { return "Hello from lamda Expression";
	};
	System.out.println(msg.sayHello());
	
	//Lamba Expression with no parameter
	MyFunctionaInterface1 f=(num) -> num+5;
	System.out.println(f.incrementbyFive(20));
	
	
	//Lamba Expression with no parameter
StringConcat s=(str1,str2) -> str1+str2;
System.out.println("String concat using lambda Expression");
System.out.println(s.sconcat("Hello", "Java 8"));

	}
	
	
	}


