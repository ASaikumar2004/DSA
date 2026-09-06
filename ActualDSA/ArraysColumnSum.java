package ActualDSA;

public class ArraysColumnSum {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int totalsum=0;
		for(int j=0;j<arr.length;j++) {
			int columnsum=0;
			
			for(int i=0;i<arr.length;i++) {
				columnsum+=arr[i][j];
			}
			System.out.println("sum of column"+(j+1)+" is: "+columnsum);
			
			totalsum+=columnsum;
		}
		
		System.out.println("total sum is: "+totalsum);
		
		
	}
}
