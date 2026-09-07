package Arrays;

public class StringArraysLinear {
	
	
	public static void main(String[] args) {
		String[] arr= {"sai","sivani","ramu","seeta"};
		String target="sivani";
		int index=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(target)) {
				index=i;
				break;
			}
		}
		
		System.out.println("elemet found at index: "+arr[index]+" "+index);
	}
	
	
	
	

}
