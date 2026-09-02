import java.util.*;

public class Main {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            int[] freq = new int[26];

            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            String key = Arrays.toString(freq);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs));
    }
}
