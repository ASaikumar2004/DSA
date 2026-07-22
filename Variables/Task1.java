package Variables;

public class Task1 {
	int eid=101;
	String ename="Sai";
	double esalary=20000;
	String ecompany="codegnan";
	double annual=esalary*12;
	public static void main(String[] args) {
		Task1 t=new Task1();
		System.out.println("eid: "+t.eid);
		System.out.println("ename: "+t.ename);
		System.out.println("ecompany: "+t.ecompany);
		System.out.println("annual slary: "+t.annual);
	}
}
