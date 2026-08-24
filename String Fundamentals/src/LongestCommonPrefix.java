public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        // First string ko initial prefix maan rahe hain
        String prefix = strs[0];

        // Baaki strings ke saath prefix compare karo
        for (int i = 1; i < strs.length; i++) {

            // Jab tak current string prefix se start nahi hoti,
            // prefix ko chhota karte jao
            while (!strs[i].startsWith(prefix)){

                // Prefix ka last character remove karo
                prefix = prefix.substring(0, prefix.length()-1);

                // Agar prefix empty ho gaya
                if (prefix == " ") {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}