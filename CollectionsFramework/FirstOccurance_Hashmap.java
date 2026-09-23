package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class FirstOccurance_Hashmap {

	public static void main(String[] args) {

		String a = "assadrt";

		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch:a.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0 )+1);
		}
		
		
		for(int i=0;i<a.length();i++) {
			if(map.get(a.charAt(i))==1) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("no elemnt");
	}

}
