package CollectionsFramework;

import java.util.ArrayList;

class Emp_info {

	int empid;
	String empname;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Emp_info(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Emp_info [empid=" + empid + ", empname=" + empname + "]";
	}
}

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Emp_info> al = new ArrayList<>();
		al.add(new Emp_info(101,"sai"));
		al.add(new Emp_info(101,"sai"));
		al.add(new Emp_info(101,"sai"));
		
		
		for(Emp_info e:al)
		{
			System.out.println(e);
		}
			

	}
}
