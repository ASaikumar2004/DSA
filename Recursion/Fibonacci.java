package Recursion;

public class Fibonacci {

	public static void fibo(int n) {
		int a = 0;
		int b = 1;

		int c;
		for (int i = 0; i < n; i++) {
			System.out.print(a+ " ");
			c = a + b;
			a = b;
			b = c;
		}
	}

	// recursion

	public static int fibrec(int n) {
		if (n <= 1) {
			return n;
		}
		return fibrec(n - 1) + fibrec(n - 2);
	}

	public static void main(String[] args) {
		fibo(5);
		int n=5;
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(fibrec(i)+" ");
		}
	}

}
