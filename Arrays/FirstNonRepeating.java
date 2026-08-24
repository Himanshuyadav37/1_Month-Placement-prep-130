import java.util.HashMap;

class FirstNonRepeating {
    public static int firstNonRepeating(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count frequencies
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find first element with frequency 1
        for (int num : arr) {
            if (freq.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[]args){
        int[] arr = {4, 5, 1, 2, 1, 4};

        System.out.print(firstNonRepeating(arr));
    }
}