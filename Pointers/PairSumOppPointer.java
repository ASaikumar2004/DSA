package Pointers;

public class PairSumOppPointer {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,9,10,11};
		
		int target=14;
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			if(arr[left]+arr[right]==target) {
				System.out.println("found pairs: "+arr[left]+" "+arr[right]);
				left++;
				right--;
			}
			else if(arr[left]+arr[right]<target) {
				left++;
			}
			else {
				right--;
			}
		}

	}
}
