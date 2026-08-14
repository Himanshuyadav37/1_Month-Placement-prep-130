import java.util.*;

class Solution {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        // Step 1: Convert both arrays into HashSets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        // Step 2: Create answer lists
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Step 3: Elements present in nums1 but not nums2
        for (int num : set1) {

            if (!set2.contains(num)) {
                list1.add(num);
            }
        }

        // Step 4: Elements present in nums2 but not nums1
        for (int num : set2) {

            if (!set1.contains(num)) {
                list2.add(num);
            }
        }

        // Step 5: Create final 2D list
        List<List<Integer>> ans = new ArrayList<>();

        ans.add(list1);
        ans.add(list2);

        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        List<List<Integer>> result =
                findDifference(nums1, nums2);

        System.out.println(result);
    }
}