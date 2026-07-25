package Arrays;

import java.util.Arrays;
import java.util.List;

public class Arraymethods {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 5, 4, 2, 3, 7);
		System.out.println(nums);

		int arr[] = { 3, 7, 1, 2, 9, 7, 5 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int index = Arrays.binarySearch(arr, 7);
		System.out.println(index);

		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 1, 2, 3 , 4};
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.compare(arr1, arr2));
		
		

	}
}
