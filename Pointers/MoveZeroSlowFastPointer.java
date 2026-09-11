package Pointers;

public class MoveZeroSlowFastPointer {

	public static void moveZeros(int arr[]) {
		int slow=0;
		
		for(int fast=0;fast<arr.length;fast++) {
			if(arr[fast]!=0) {
				int temp=arr[slow];
				arr[slow]=arr[fast];
				arr[fast]=temp;
				slow++;
			}
		}		
		for(int n:arr)
		{
			System.out.print(n+" ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {0,1,0,2,3};
		
		moveZeros(arr);
		
	}

}
