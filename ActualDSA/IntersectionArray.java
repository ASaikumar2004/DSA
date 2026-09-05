package ActualDSA;

public class IntersectionArray {
	
	public static void main(String[] args) {
		int a[]= {1,2,2,4,6};
		int b[]= {2,2,3,4};
		
		for(int i=0;i<a.length;i++) {
			boolean present=false;
			
			//duplicate check
			for(int k=0;k<i;k++) {
				if(a[k]==a[i]) {
					present=true;
				}
			}
			
			if(present) {
				continue;
			}

			
			for(int j=1;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");
					break;
				}
			}
		}
	}

}
