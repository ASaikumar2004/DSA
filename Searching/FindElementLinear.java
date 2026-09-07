package Searching;

public class FindElementLinear {
	
	public static void main(String[] args) {
		int arr[]= {1,7,2,9,4,8};
		int target=4;
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
		}
		
		System.out.println(index!=-1?"found at index: "+index:"not found");
	}

}
