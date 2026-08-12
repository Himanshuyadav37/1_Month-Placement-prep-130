import java.util.Arrays;

public class TwoSumIISortedArray {

    public static int[] twoSum(int[] nums, int target){
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length-1;

        while(left < right){

            int sum = nums[left] + nums[right];

            if(sum < target){
                left++;
            }else if(sum > target){
                right--;
            }else{
                return new int[]{nums[left], nums[right]};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 18;

        int[] result = twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
