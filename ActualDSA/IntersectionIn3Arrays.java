package ActualDSA;

public class IntersectionIn3Arrays {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 3, 4, 6, 7 };
		int[] c = { 3, 4, 8, 9 };
		
		for(int i=0;i<a.length;i++) {
			
			boolean foundinb=false;
			boolean foundinc=false;
			
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					foundinb=true;
					break;
				}
			}
			
			for(int k=0;k<c.length;k++) {
				if(a[i]==c[k]) {
					foundinc=true;
					break;
				}
			}
			
			if(foundinb && foundinc) {
				System.out.println(a[i]+" ");
			}	
		}
	}

}
