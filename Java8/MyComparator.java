package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparator{
	
//	@Override
//	public int compare(Integer i1, Integer i2) {
//		if(i1<i2) {
//			return 1;
//			
//		}
//		else if(i1>i2) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
//	}
//	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(47);
		al.add(34);
		al.add(22);
		
		Comparator<Integer> c=(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0;
		Collections.sort(al,c);
		
		System.out.println(al);
	}

	

	
}
