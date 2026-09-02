package ActualDSA;

public class InsertValue {
	
	public static void main(String[] args) {
		int arr[]= {12,14,16,19};
		int newarr[]=new int[arr.length+1];
		int pos=2;
		int value=15;
	
		for(int i=0;i<pos;i++) {
				newarr[i]=arr[i];
		}
		newarr[pos]=value;
		
		for(int i=pos;i<arr.length;i++) {
			newarr[i+1]=arr[i];
		}
		
		for(int num:newarr) {
			System.out.println(num);
		}
	}

}
