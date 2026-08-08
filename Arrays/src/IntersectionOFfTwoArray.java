import java.util.HashMap;
import java.util.ArrayList;

class IntersectionOfTwoArray {

    public static ArrayList<Integer> intersection(
            int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: Store frequency of arr1
        for (int num : arr1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();

        // Step 2: Process arr2
        for (int num : arr2) {

            if (freq.getOrDefault(num, 0) > 0) {

                result.add(num);

                freq.put(num, freq.get(num) - 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 5};

        System.out.println(intersection(arr1, arr2));
    }
}