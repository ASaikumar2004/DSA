package ActualDSA;

public class Update {
	
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int pos=2;
		int value=4;
		
		for(int i=0;i<arr.length;i++) {
			if(i==pos) {
				arr[i]=value;
				break;
			}
		}
		
		for(int num:arr) {
			System.out.println(num);
		}
	}

}
