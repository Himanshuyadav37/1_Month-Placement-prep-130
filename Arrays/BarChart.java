import java.util.*;

class BarChart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Print bar chart
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i]; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}