package Searching;

public class FindLastOccurance {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,2,2,2,2,2,3,4};
		
		int target=2;
		int left=0;
		int right=arr.length-1;
		
		int res=-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			
			if(arr[mid]==target) {
				res=mid;
				left=mid+1;
			}
			else if(arr[mid]>target){
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		System.out.println(res);
		
	}

}
