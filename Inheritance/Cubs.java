package Inheritance;

class Animal{
	void sound() {
		System.out.println("Animals makes sound ");
	}
}

class Lion extends Animal{
	String lion="Lion";
}

public class Cubs extends Lion {

	void cubs() {
		System.out.println("Lion having cubs");
	}
	
	public static void main(String[] args) {
		Cubs c=new Cubs();
		System.out.println(c.lion);
		c.cubs();
		c.sound();
		
	}
}
