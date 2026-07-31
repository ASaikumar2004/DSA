package Keyword;

public class Student {
	
	String name;  //instance--->object
	
	public Student(String name) {
		this.name=name;
	}
	
	
	void display() {
		System.out.println(name);
		System.out.println(this);
	}
	
	
	public static void main(String[] args) {
		Student s=new Student("bahubali");
		s.display();
		System.out.println(s);
	}
}
