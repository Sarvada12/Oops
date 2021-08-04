package miscellaneous;


class Sample<T>//parameterized class/ generic class
{
	private T data; //Generic variable declaration

	public Sample(T data) {
		
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	

}
public class GenricClassDemo {

	public static void main(String[] args) {
		
		Sample<String> s1=new Sample<String>("Java Generics");//object of generic class for type String
System.out.println("Display from Generic class by passing string object :"+s1.getData());		

Sample<Integer> s2=new Sample<Integer>(200);
System.out.println("Display from Generic class by passing Integer object :"+s2.getData());

Sample<Double> s3=new Sample<Double>(550.0);
System.out.println("Display from Generic class by passing Integer object :"+s3.getData());

	}

}
