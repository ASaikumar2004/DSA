package Searching;

public class FindFirstOccurance {
	
	public static void main(String[] args) {
		int arr[]= {1,2,2,2,2,2,2,2,2,3,4};
		int target=2;
		
		int left=0;
		int right=arr.length-1;
		
		int result=-1; //no index found
		
		while(left<=right) {
			int mid=(left+right)/2;
			
			if(arr[mid]==target) {
				result=mid;
				right=mid-1;
			}
			
			else if(mid>target) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
			
		}
		
		System.out.println("index found at : "+result);
	}
	
}
