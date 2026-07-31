package pack1;

class parent {
	public void m2() {
		System.out.println("this is parent m2 method");
	}
}

public class Employee extends parent{

	public void m1() {
		System.out.println("i am from employee m1 method....");
	}

	public static void main(String[] args) {
		Employee m1 = new Employee();
		m1.m1();
//		m1.m2();
		
//		parent p=new parent();
//		p.m2();
	}
}
