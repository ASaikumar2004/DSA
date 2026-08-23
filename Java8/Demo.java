package Java8;

interface calculator{
	public int add(int a , int b);
}
public class Demo {
	public static void main(String[] args) {
		
//		calculator cal=new calculator() {
//			
//			@Override
//			public int add(int a, int b) {
//				return a+b;
//			}
//		};
		
		
		calculator cal=(a ,b)->{return a+b;};
		System.out.println(cal.add(10, 20));
	}
}
