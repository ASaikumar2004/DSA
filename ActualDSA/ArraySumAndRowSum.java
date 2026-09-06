package ActualDSA;

public class ArraySumAndRowSum {
	
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int totalsum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			int rowsum=0;
			for(int j=0;j<arr.length;j++) {
				rowsum=rowsum+arr[i][j];
				
				totalsum=totalsum+arr[i][j];
			}
			
			System.out.println("sum of "+(i+1)+" row is: "+rowsum);
		}
		
		System.out.println("totalsum is: "+totalsum);
	}

}
