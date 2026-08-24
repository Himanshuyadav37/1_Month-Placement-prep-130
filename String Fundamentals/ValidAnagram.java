public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        // Agar dono strings ki length different hai,
        // to wo kabhi bhi anagram nahi ho sakti
        if (s.length() != t.length()) {
            return false;
        }

        // 26 size ka array banaya because
        // lowercase English characters a-z hain
        //
        // freq[0]  -> 'a'
        // freq[1]  -> 'b'
        // freq[2]  -> 'c'
        // ...
        // freq[25] -> 'z'
        int[] freq = new int[26];


        // First string ke har character ki frequency increase (+1) karenge
        for (char ch : s.toCharArray()) {

            // ch - 'a' character ko 0-25 index mein convert karta hai
            //
            // Example:
            // 'a' - 'a' = 0
            // 'b' - 'a' = 1
            // 'c' - 'a' = 2
            //
            // Then us character ki frequency +1 kar do
            freq[ch - 'a']++;
        }


        // Second string ke har character ki frequency decrease (-1) karenge
        for (char ch : t.toCharArray()) {

            // Same character ka index find karke
            // uski frequency 1 se decrease kar do
            freq[ch - 'a']--;
        }


        // Ab check karenge ki har character ki final frequency 0 hai ya nahi
        //
        // Agar sab 0 hain:
        // s aur t mein same characters same frequency mein hain
        // => Valid Anagram
        //
        // Agar koi bhi value 0 nahi hai:
        // frequency mismatch hai
        // => Not Anagram
        for (int count : freq) {

            if (count != 0) {
                return false;
            }
        }

        // Sab frequencies 0 hain
        // => Strings are valid anagrams
        return true;
    }


    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        // isAnagram() true/false return karega
        System.out.println(isAnagram(s, t));
    }
}