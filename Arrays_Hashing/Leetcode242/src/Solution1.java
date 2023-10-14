import java.util.HashMap;

public class Solution1 {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> counter1 = new HashMap<Character, Integer>();
        for ( char i: s.toCharArray() )
        {
            counter1.put(i, counter1.getOrDefault(i, 0) + 1);
        }

        for ( char j: t.toCharArray() )
        {
            counter1.put(j, counter1.getOrDefault(j, 0) - 1);
        }

        for (int item: counter1.values()) {
            if (item != 0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}