import java.util.*;

public class SumOfTwoArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int i = n1 - 1;
        int j = n2 - 1;

        int maxSize = Math.max(n1, n2);
        int[] result = new int[maxSize + 1];

        int k = result.length - 1;
        int carry = 0;

        // Add from right to left
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += arr1[i];
                i--;
            }

            if (j >= 0) {
                sum += arr2[j];
                j--;
            }

            result[k] = sum % 10;
            carry = sum / 10;

            k--;
        }

        // Print result
        System.out.print("Sum: ");

        int start = (result[0] == 0) ? 1 : 0;

        for (int x = start; x < result.length; x++) {
            System.out.print(result[x] + " ");
        }
    }
}