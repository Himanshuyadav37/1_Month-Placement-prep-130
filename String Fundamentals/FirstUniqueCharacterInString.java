import java.util.Scanner;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] arr = new int[26];

        // Frequency count
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }

        // First unique character
        int ans = -1;

        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}