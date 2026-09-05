package ActualDSA;

public class RotateArray {
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int k=2;
		for(int i=1;i<=k;i++) {
			
			int first=arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
				
			}
			arr[arr.length-1]=first;
		}
		for(int num:arr) {
		System.out.print(num+" ");
		}
	}

}
