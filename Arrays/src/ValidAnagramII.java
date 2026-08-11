

   import java.util.*;

    public class ValidAnagramII {

        public List<List<String>> groupAnagrams(String[] strs) {

            HashMap<String, List<String>> map = new HashMap<>();

            for (int i = 0; i < strs.length; i++) {

                char[] chars = strs[i].toCharArray();

                Arrays.sort(chars);

                String key = new String(chars);

                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<String>());
                }

                map.get(key).add(strs[i]);
            }

            return new ArrayList<>(map.values());
        }

        public static void main(String[] args) {

            ValidAnagramII obj = new ValidAnagramII();

            String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

            List<List<String>> result = obj.groupAnagrams(strs);

            System.out.println(result);
        }
    }