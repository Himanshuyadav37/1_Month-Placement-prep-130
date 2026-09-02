import java.util.*;

public class Main {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            // 1. String ko character array me convert karo
            char[] chars = s.toCharArray();

            // 2. Characters sort karo
            Arrays.sort(chars);

            // 3. Sorted characters ko key banao
            String key = new String(chars);

            // 4. Same key wali strings ko same group me daalo
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
