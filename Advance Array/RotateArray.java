public class RotateArray {

    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        // Agar k array length se bada hai
        k = k % n;

        // Step 1: Reverse complete array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    // Array ke given range ko reverse karta hai
    public static void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
