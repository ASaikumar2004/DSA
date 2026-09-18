package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Hash_map_diff {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 3, 4 };
		int k = 2;

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];

			//negative numbers
			if (map.containsKey(num - k)) {
				System.out.println("indexes: " + map.get(num - k) + " " + i);
				System.out.println("values: " + (num - k) + " " + num);
				return;
			}
			
			//positive number
			if (map.containsKey(num + k)) {
				System.out.println("indexes: " + map.get(num + k) + " " + i);
				System.out.println("values: " + (num + k) + " " + num);
				return;
			}

			map.put(num, i);
		}
		System.out.println("no pair found");
	}
} 
