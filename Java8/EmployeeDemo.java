package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class employee{
	int empid;
	String empname;
	
	employee(int empid,String empname){
		this.empid=empid;
		this.empname=empname;
	}

	@Override
	public String toString() {
		return "empid=" + empid + ", empname=" + empname;
	}
	
	
	
}
public class EmployeeDemo{
	public static void main(String[] args) {
		ArrayList<employee> al=new ArrayList<>();
		al.add(new employee(123, "sai"));
		al.add(new employee(124, "sivani"));
		al.add(new employee(121, "dhoni"));
		
		System.out.println(al);
		Comparator<employee> c=(e1,e2)->(e1.empid>e2.empid)?1:(e1.empid<e2.empid)?-1:0;
		Collections.sort(al,c);
		
		System.out.println(al);
		
		
	}

}
