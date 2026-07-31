package Keyword;


class person{
	
	int salary=60000;
	
	public void getsalary(int salary) {
		
		salary=20000;
		System.out.println("parent salary is: "+salary);
		System.out.println("parent class global salary: "+this.salary);
	}
	
}
public class Employee extends person{
	
	int salary=30000;
	
	public void getsalary(double salary) {
		System.out.println("my parttime salary: "+salary);
	}
	
	public void getSalary(int salary) {
		salary=20000;  //local
		System.out.println(salary); //local
		System.out.println(this.salary); // global
		
		super.getsalary(40000);
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.getSalary(10000);
	}

}
