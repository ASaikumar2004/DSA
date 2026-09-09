package Searching;

public class StringBinarySearch {
	
	public static void main(String[] args) {
		
		String arr[]= {"Apple","Ball","Car","Dog","Eagle"};
		String target="Car";
		
		int low=0;
		int high=arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			
			int mid=(low+high)/2;
			//lexographical comparision
			int cmp=arr[mid].compareTo(target);
			
			if(cmp==0)
			{
				System.out.println("found At : "+mid);
				return;
			}
			else if(cmp>0) {
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		
		System.out.println("element not found");
		
	}

}
