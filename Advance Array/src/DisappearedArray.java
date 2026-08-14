import java.util.*;

class DisappearedArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

       // step 1: Mark present number
        for(int i =0;i<nums.length;i++){
            int index  = Math.abs(nums[i]-1);

            if(nums[index]>0){
                nums[index] = -nums[index];
            }
        }

        // Step 2: FInd unmarked indexes
        for(int i =0; i< nums.length; i++){
            if(nums[i] > 0){
                ans.add(i+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = findDisappearedNumbers(nums);

        System.out.println(result);
    }
}