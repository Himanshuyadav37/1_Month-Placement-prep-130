class PivotIndex {

    public static int pivotIndex(int[] nums) {

        // Step 1: Calculate total sum
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        // Step 2: Maintain left sum
        int leftSum = 0;

        // Step 3: Find pivot index
        for (int i = 0; i < nums.length; i++) {

            // Right sum = total - left - current element
            int rightSum = totalSum - leftSum - nums[i];

            // Check pivot
            if (leftSum == rightSum) {
                return i;
            }

            // Current element becomes part of left side
            leftSum += nums[i];
        }

        // No pivot found
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 6, 5, 6};

        int result = pivotIndex(nums);

        System.out.println(result);
    }
}