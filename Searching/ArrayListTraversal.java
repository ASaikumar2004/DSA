package Searching;

import java.util.Arrays;
import java.util.List;

public class ArrayListTraversal {
	
	public static void main(String[] args) {
		List<String> li=Arrays.asList("pen","paper","book","pencil");
		
		String target="book";
		
		for(int i=0;i<li.size();i++) {
			if(li.get(i).equals(target)) {
				System.out.println("Element found");
				return;
			}
		}

		
		System.out.println("not found the target element");
		
	}

}
