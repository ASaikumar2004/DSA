package Variables;

public class Demo {
	//static variables
	static int age=23;
	//instance variables
	String name="Sai";
	public static void main(String[] args) {
		//local variables ---->belongs to the method
		int age=22;
		String name="sivani";
		System.out.println("this is static variable: "+Demo.age);
		Demo d=new Demo();
		System.out.println("this is instance variables: "+d.name);
		System.out.println("this is local varibales: "+name+" "+age);
	}
}
