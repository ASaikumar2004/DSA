package SortingTechniquies;

public class Bubblesort {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		boolean swapped=false;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			
			
			
			if(!swapped) {
				System.out.println("already sorted");
				break;
			}
		}
		
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
