package Keyword;

public class Student {
	
	String name;
	public Student(String name) {
		name=name;
	}
	
	
	void display() {
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		Student s=new Student("bahubali");
		s.display();
	}
}
