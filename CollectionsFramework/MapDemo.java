package CollectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class MapDemo {
	
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(101, "Sai");
		hm.put(102, "sivani");
		
		System.out.println(hm);
		System.out.println(hm.containsKey(234));
		System.out.println(hm.getOrDefault(1234, "love"));
		System.out.println(hm.isEmpty());
		
		Set<Entry<Integer,String>> st=hm.entrySet();
		Iterator<Entry<Integer,String>> itr=st.iterator();
		while(itr.hasNext()) {
			Entry<Integer,String> finalresult=itr.next();
			System.out.println(finalresult.getKey()+" "+finalresult.getValue());
		}
	}

}
