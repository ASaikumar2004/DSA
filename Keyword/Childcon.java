package Keyword;

class Parentcon{
	public Parentcon(){
		System.out.println("it is a parent constructor");
	}
	
	public Parentcon(int age) {
		this.m1();
		System.out.println("Age of parent is: "+age);
	}
	
	
	public void m1() {
		System.out.println("it is parent class m1 method...");
	}
}
public class Childcon extends Parentcon {
	public Childcon() {
		super();
		this.m1();
		System.out.println("It is child consturctor");
	}
	
	public void m1() {
		System.out.println("child class m1 method....");
	}
	
	
	
	public static void main(String[] args) {
		Childcon c=new Childcon();
				
	}

}
