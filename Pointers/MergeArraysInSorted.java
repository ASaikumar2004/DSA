package Pointers;

public class MergeArraysInSorted {

    public static void main(String[] args) {

        int a[] = {1, 3, 5};
        int b[] = {2, 4, 6};

        int res[] = new int[a.length + b.length];

        int i = 0;  // pointer for a
        int j = 0;  // pointer for b
        int k = 0;  // pointer for res

        // Compare elements from both arrays
        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
            } else {
                res[k] = b[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of a
        while (i < a.length) {
            res[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements of b
        while (j < b.length) {
            res[k] = b[j];
            j++;
            k++;
        }

        // Print merged array
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}