package Recursion;

public class SumofN {
	public static int sumLoop(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
	
//	recusion loops 
	public static int sumrec(int n) {
		if(n==0) {
			return 0;
		}
		return n+sumrec(n-1);
	}
	
	
	public static void main(String[] args) {
		int n=10;
		System.out.println(sumLoop(n));
		
		System.out.println(sumrec(n));
	}

}
