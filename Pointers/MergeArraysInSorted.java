package Pointers;

public class MergeArraysInSorted {
	
	public static void main(String[] args) {
		int a[]= {1,3,5};
		int b[]= {2,4,6};
		int res[]=new int[a.length+b.length];
		
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				res[k]=a[i];
				i++;
			}
			else {
				res[k]=b[j];
				j++;
			}
			k++;
		}
		
		while(i<a.length) {
			res[k]=a[i];
			i++;
			k++;
		}
		
		while(j<a.length) {
			res[k]=b[j];
			j++;
			k++;
		}
		
		for(int num:res) {
			System.out.print(num+" ");
		}
	}

}
