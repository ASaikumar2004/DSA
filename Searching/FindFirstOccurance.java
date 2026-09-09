package Searching;

public class FindFirstOccurance {
	
	public static void main(String[] args) {
		int arr[]= {1,2,2,2,2,2,2,2,2,3,4};
		int target=2;
		
		int left=0;
		int right=arr.length-1;
		
		int l1=0;
		int r1=arr.length-1;
		
		int result=-1; //no index found
		int result1=-1;
		
		//first occurance
		while(left<=right) {
			int mid=(left+right)/2;
			
			if(arr[mid]==target) {
				result=mid;
				right=mid-1;
			}
			
			else if(arr[mid] > target) {
				right=mid-1;
			}
			else {
				left=mid+1; 
			}
		}
		
		//last occurance
		while(l1<=r1) {
			int mid=(l1+r1)/2;
			
			if(arr[mid]==target) {
				result1=mid;
				l1=mid+1;
			}
			
			else if(arr[mid] > target) {
				r1=mid-1;
			}
			else {
				l1=mid+1; 
			}
		}
		System.out.println("first occurance : "+result);
		System.out.println("last occurance: "+result1);
	}
}
