import java.util.HashMap;

public class CheckFrequency {

    public static HashMap<Integer, Integer> checkFrequency(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 2, 4, 5, 6, 4, 5, 6, 4, 5, 4, 4};

        HashMap<Integer, Integer> result = checkFrequency(arr);

        System.out.println(result);
    }
}