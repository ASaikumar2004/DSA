package ActualDSA;

public class AverageArray {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int sum=0;
		for(int n:arr) {
			sum=sum+n;
		}
		
		double average=sum/arr.length;
		
		System.out.println(average);
	}

}
