import java.util.HashMap;

public class ArrayContainDuplicate {

    public static boolean containsDuplicate(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int nums : arr) {

            if (map.containsKey(nums)) {
                return true;
            }

            map.put(nums, 1);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 1};

        System.out.println(containsDuplicate(arr));
    }
}


//----------------------- HashSet --------------------------------

import java.util.HashSet;

public class ArrayContainDuplicate {

    public static boolean containsDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 1};

        System.out.println(containsDuplicate(arr));
    }
}