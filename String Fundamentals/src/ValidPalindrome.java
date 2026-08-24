public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        // Left pointer starting index par
        int left = 0;

        // Right pointer last index par
        int right = s.length() - 1;

        // Jab tak dono pointers cross nahi karte
        while (left < right) {

            // Agar left character alphanumeric nahi hai,
            // to usko skip karo
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            // Agar right character alphanumeric nahi hai,
            // to usko skip karo
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            // Dono characters ko lowercase mein convert karke compare karo
            // Agar different hain, to palindrome nahi hai
            if (Character.toLowerCase(s.charAt(left))
                    != Character.toLowerCase(s.charAt(right))) {

                return false;
            }

            // Dono characters same hain,
            // isliye pointers ko andar move karo
            left++;
            right--;
        }

        // Agar koi mismatch nahi mila,
        // to string valid palindrome hai
        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
}