package oopsdemo1;

public class Book {
	
	int bookId;
	String BOOKNAME;
float price;

String Publisher;

public int getBookId() {
	return bookId;
}

public void setBookId(int bookId) {
	this.bookId = bookId;
}

public String getBOOKNAME() {
	return BOOKNAME;
}

public void setBOOKNAME(String bOOKNAME) {
	BOOKNAME = bOOKNAME;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public String getPublisher() {
	return Publisher;
}

public void setPublisher(String publisher) {
	Publisher = publisher;
}

@Override
public String toString() {
	return "Book [bookId=" + bookId + ", BOOKNAME=" + BOOKNAME + ", price=" + price + ", Publisher=" + Publisher + "]";
}


}
