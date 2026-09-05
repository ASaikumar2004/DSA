package ActualDSA;

public class RightRotateArray {
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		
		int k=2;
		
		for(int i=1;i<=k;i++) {
			//store the last element
			int last=arr[arr.length-1];
			
			//shift the elements right 
			for(int j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}
