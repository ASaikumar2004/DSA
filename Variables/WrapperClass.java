package Variables;

public class WrapperClass {
	
	public static void main(String[] args) {
		double salary=Double.parseDouble(args[0]);
		double annual=Double.parseDouble(args[1]);
		double annual1=annual*salary;
		System.out.println(annual1);
	}
}
