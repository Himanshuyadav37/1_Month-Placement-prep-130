import java.util.HashMap;

public class FirstDuplicate {

    public static int firstDuplicate(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            if (map.containsKey(num)) {
                return num;
            }

            map.put(num, 1);
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 1};

        System.out.println(firstDuplicate(arr));
    }
}