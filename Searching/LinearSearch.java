package Searching;

import java.util.Arrays;

public class LinearSearch {
	
	public static void main(String[] args) {
		int arr[]= {10,20,40,30,60,80,90};
		int target=30;
		Arrays.sort(arr);
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>target) {
				break;
			}
			
			if(arr[i]==target) {
				index=i;
				break;
			}
		}
		
		System.out.println("element found at index: "+index);
	}

}
