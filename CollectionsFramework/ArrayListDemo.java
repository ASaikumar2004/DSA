package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("sai");
		al.add("sivani");
		al.add("ram");
		al.add("seeta");
		al.add("sravani");
		
		System.out.println(al);
		
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("sai")) {
			itr.remove();
		}
		}
		
		System.out.println(al);
			
	}
	

}
