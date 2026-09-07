package Searching;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		int arr[]= {10,30,20,40,60,50,70,80,25};
		Arrays.sort(arr);
		int target=50;
		
		int left=0;
		int right=arr.length-1; 
		while(left<=right) {
			int mid=(left+right)/2;
			
			if(arr[mid]==target) {
				System.out.println("Element found at middle index: "+mid);
				return;
			}
			
			else if(arr[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		
		System.out.println("not found");
	}

}
