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




//----------------------------------------------------------------------------------------------------------
class RemoveDuplicate{
    public static int removeDuplicate(int[] arr){
        int slow = 0;
        for(int fast  = 0 ; fast < arr.length ; fast++){
            if(arr[slow] < arr[fast]){
            int temp = arr[slow+1];
            arr[slow+1] = arr[fast];
            arr[fast] = temp;
            slow++;
        }
    }
    return slow+1;
    }
    public static void main(String[] args){
        int[] arr = {0,1,1,1,2,2,3};
        System.out.println(removeDuplicate(arr));
    }
}
