import java.util.HashMap;

public class LongestSubarrayWithSumK {


    public static int longestSubarray(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        // Prefix sum 0 exists before the array starts
        map.put(0, -1);

        int prefixSum = 0;
        int maxLength = 0;

        for(int i = 0 ; i<arr.length; i++){

            prefixSum += arr[i];

            int required = prefixSum - k;

            if(map.containsKey(required)){

                int length  =  i - map.get(required);

                maxLength = Math.max(maxLength, length);
            }
            // Store FIRST occurrence only
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        return maxLength;

    }
    public static void main(String[] args){
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        System.out.println(longestSubarray(arr, k));
    }
}
