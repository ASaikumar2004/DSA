package Recursion;

public class ReverseString {
	
	public static String revstring(String name) {
		if(name.length() <= 1) {
		 return name;
		}
		return name.charAt(name.length()-1)+revstring(name.substring(0,name.length()-1));
	}
	
	public static void main(String[] args) {
	  System.out.println(revstring("sai"));
	}

}
