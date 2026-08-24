import java.util.*;

class MergeSortedArray {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;

        int[] ans = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare both arrays
        while (i < m && j < n) {

            if (arr1[i] <= arr2[j]) {
                ans[k++] = arr1[i++];
            } else {
                ans[k++] = arr2[j++];
            }
        }

        // Remaining elements of arr1
        while (i < m) {
            ans[k++] = arr1[i++];
        }

        // Remaining elements of arr2
        while (j < n) {
            ans[k++] = arr2[j++];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] result = mergeSortedArrays(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }
}