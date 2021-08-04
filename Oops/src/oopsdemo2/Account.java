package oopsdemo2;
//Multilevel inheritance
public class Account {
int accno;
String name;
public Account(int accno, String name) {
	this.accno = accno;
	this.name = name;
}
void display()
{
	System.out.println("*********account details***********");
	System.out.println("account no:"+accno);
	System.out.println("customer name: "+name);
}


}
