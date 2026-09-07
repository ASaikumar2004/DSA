package Searching;

public class StringBinarySearch {
	
	public static void main(String[] args) {
		
		String arr[]= {"Apple","Ball","Car","Dog","Eagle"};
		String target="Cat";
		
		int low=0;
		int high=arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			
			int mid=(low+high)/2;
			
			if(arr[mid].equals(target)) {
				System.out.println("element found at index: "+mid);
				return;
			}
			else if(arr[mid].charAt(0)>target.charAt(0)) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		
		System.out.println("element not found");
		
	}

}
