import java.util.Arrays;
import java.util.HashMap;

public class Solution2 {
    public static boolean isAnagram(String s, String t) {
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();

        Arrays.sort(s_array);
        Arrays.sort(t_array);

        return Arrays.equals(s_array, t_array);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
