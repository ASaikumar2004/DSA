package DefaultMethods;

interface Employee {
	void work();
	//static methods
	static void companyname() {
		System.out.println("ABC company..");
	}
}

class Developer implements Employee{

	@Override
	public void work() {
		System.out.println("Handling some work...");	
	}
}

public class Company {
	public static void main(String[] args) {
		
		Developer d=new Developer();
		d.work();
		Employee.companyname();

	}
}
