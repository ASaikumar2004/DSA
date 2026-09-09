package Searching;

public class SquareRootElement {

	public static void main(String[] args) {
		
		 int n=20;
		 
		 int left=0;
		 int right=n;
		 
		 int result=0;
		 
		 while(left<=right) {
			 int mid=(left+right)/2;
			 
			 if(mid*mid == n) {
				 result=mid;
				 break;
			 }
			 else if( mid *mid < n) {
				 result=mid;
				 left=mid+1;
			 }
			 else {
				 right=mid-1;
			 }
		 }
		 
		 System.out.println(result);
	}
}
