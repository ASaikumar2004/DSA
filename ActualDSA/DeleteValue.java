package ActualDSA;

public class DeleteValue {
	
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int pos=2;
		int newarr[]=new int[arr.length-1];
		for(int i=0;i<pos;i++) {
			newarr[i]=arr[i];
		}
		
		for(int i=pos;i<newarr.length;i++) {
			newarr[i]=arr[i+1];
		}
		
		for(int num:newarr) {
			System.out.println(num);
		}
		
	}

}
