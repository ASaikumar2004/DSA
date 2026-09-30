package Recursion;

public class RecursiveDigitSum {
	
	public static int digitsum(int n) {
		if(n < 10) {
			return n;
		}
		int sum=0;
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
		}
		return digitsum(sum);
	}
	
	public static void main(String[] args) {
		int n=54321;
		System.out.println(digitsum(n));
	}

}
