public class SquareOfSortedArray {
    public static int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        int[] result = new int[nums.length];

        int position = nums.length - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {

                result[position] = leftSquare;
                left++;

            } else {

                result[position] = rightSquare;
                right--;
            }

            position--;
        }

        return result;
    }
    public static void main(String[] args){
        int[] nums = {-7, -3, 2, 3, 11};

        int[] result = sortedSquares(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
