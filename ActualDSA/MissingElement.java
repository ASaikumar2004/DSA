package ActualDSA;

public class MissingElement {
	
	public static void main(String[] args) {
		int arr[]= {1,0,3};
		int actualsum=0;
		int arraysum=0;
		for(int i=0;i<arr.length;i++) {
			arraysum=arraysum+arr[i];
		}
		
		for(int i=0;i<=arr.length;i++) {
			actualsum=actualsum+i;
		}
		int missing=actualsum-arraysum;
		System.out.println(missing);
	}

}
