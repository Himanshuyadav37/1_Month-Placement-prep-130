import java.util.*;

class SpanArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Total how many elements you want:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        // Find min and max
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print only once
        System.out.println("Span of Element : " + (max - min));
    }
}