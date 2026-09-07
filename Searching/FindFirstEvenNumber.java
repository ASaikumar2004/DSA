package Searching;

public class FindFirstEvenNumber {
	
	public static void main(String[] args) {
		
		int arr[]= {1,3,7,5,4,8};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("first even number :"+arr[i]);
				return;
			
			}
		}
		System.out.println("not found");
		
		
	}

}
