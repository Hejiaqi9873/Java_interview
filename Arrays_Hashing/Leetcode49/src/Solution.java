//49. Group Anagrams
import java.util.*;
public class Solution {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> result = new HashMap<String,List<String>>();

        for (String s: strs) {
            char[] s_array = s.toCharArray();
            Arrays.sort(s_array);

            String item = new String(s_array);

            if (!result.containsKey(item)) {
                result.put(item, new ArrayList<String>());
            }
            result.get(item).add(s);
        }
        return new ArrayList<>(result.values());
    }
    public static void main(String[] args) {
        String[] strings = {"abc", "cba"};
        List<List<String>> items = groupAnagrams(strings);
        for (List<String> k: items) {
            System.out.println(k);
        }
    }
}
