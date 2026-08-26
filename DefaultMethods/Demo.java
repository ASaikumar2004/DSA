package DefaultMethods;

interface A{
	void m1();   //by default it is public abstract
	
//	void m2();
	default void m2() {
		System.out.println("This is default method");
	}
	
	static void chitchat() {
		System.out.println("chit chating in the class");
	}
}
class B implements A{
	@Override
	public void m1() {
		System.out.println("is a class b i am sleeping");
	}
	
	@Override
	public void m2() {
		System.out.println("It is overridden method of defalut method");
	}
}

class C implements A{
	public void m1() {
		System.out.println("it is class C and i am eating");
	}
	
//	public void m2() {
//		System.out.println("this is m2 method");
//	}
}


public class Demo implements A{
	@Override
	public void m1() {
		System.out.println("Is is overridden m1 method");
	}
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.m1();
		A.chitchat();
		
		
	}

	

	

}
