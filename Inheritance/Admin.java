package Inheritance;

class Guest{
	void read() {
		System.out.println("He can read the data");
	}
}

class Developer extends Guest{
	void write() {
		System.out.println("HE can build the application");
	}
}
public class Admin extends Developer {

	void delete() {
		System.out.println("Admin can have users");
	}
	public static void main(String[] args) {
		Admin a=new Admin();
		a.read();
		a.write();
		a.delete();
	}
}
