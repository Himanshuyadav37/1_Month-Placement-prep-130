public class RemoveDuplicateFromSortedArray {
        public static int removeDuplicates(int[] nums) {

            if (nums.length == 0) {
                return 0;
            }

            int slow = 0;

            for (int fast = 1; fast < nums.length; fast++) {

                if (nums[slow] != nums[fast]) {

                    slow++;
                    nums[slow] = nums[fast];
                }
            }

            return slow + 1;
        }
    public static void main(String[] args){
            int[] nums = {1,1,1,2,3,3,4,5,6,8};

        int k = removeDuplicates(nums);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nUnique elements: " + k);
    }
}
