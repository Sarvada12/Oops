package oopsdemo1;

public class BookTest {

	public static void main(String[] args) {
		
		Book b1=new Book();
		b1.setBookId(101);
		b1.setBOOKNAME("prg c");
		b1.setPrice(200);
		b1.setPublisher("prime book");
		
		
		System.out.println("**book Details**");
		System.out.println(b1.getBookId()+" "+b1.getBOOKNAME()+" "+b1.getPrice()+" "+b1.getPublisher());
		
		
		System.out.println(b1);//invoke tostring mtd in the instance
	}

}
