package Arrays;

public class Employee {

	int emipd;
	String empname;
	
	public Employee(int empid,String empname) {
		this.emipd=empid;
		this.empname=empname;
	}
	@Override
	public String toString() {
		return "Employee [empid=" +emipd+",empname="+empname +"]";
	}
	 
	public static void main(String[] args) {
		Employee e=new Employee(23, "Sai");
		Employee e1=new Employee(2004, "Saikumar");
		Employee e2=new Employee(23, "Sai sdfgh");
		
		Employee emp[]= {e,e1,e2};
		for(Employee st:emp) {
			System.out.println(st);
		}
	}
}
