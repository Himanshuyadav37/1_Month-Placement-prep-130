import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int required = target - nums[i];

            if (map.containsKey(required)) {
                return new int[] {
                        map.get(required),
                        i
                };
            }

            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 3, 5, 1, 5};
        int target = 9;

        int[] result = twoSum(arr, target);

        System.out.println(Arrays.toString(result));
    }
}





//1. HashMap banao
//                  ↓
//           2. Array traverse karo
//   ↓
//           3. required = target - nums[i]
//                       ↓
//        4. required map mein hai?
//        ↓ YES
//   return {map.get(required), i}
//        ↓ NO
//5. nums[i] ko map mein store karo
//   ↓
//           6. Next element par jao
//   ↓
//           7. Pura loop khatam ho gaya
//   ↓
//           8. return new int[]{}t[]{}