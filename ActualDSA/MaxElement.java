package ActualDSA;

public class MaxElement {
	
	public static void main(String[] args) {
		int arr[] ={10,20,80,45,23};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("maximun is: "+max);
	}

}
