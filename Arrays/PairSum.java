import java.util.HashSet;

class PairSum {

    public static void findPairs(int[] arr, int target) {

        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> printed = new HashSet<>();

        for (int num : arr) {

            int required = target - num;

            if (seen.contains(required)) {

                int smaller = Math.min(num, required);
                int larger = Math.max(num, required);

                String pair = smaller + "," + larger;

                if (!printed.contains(pair)) {
                    System.out.println("(" + smaller + ", " + larger + ")");
                    printed.add(pair);
                }
            }

            seen.add(num);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 2, 5};
        int target = 5;

        findPairs(arr, target);
    }
}