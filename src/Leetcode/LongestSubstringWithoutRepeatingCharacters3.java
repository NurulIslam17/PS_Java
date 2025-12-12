package Leetcode;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        String s = "bbabcabcdbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        int res = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left+=1;
            }
            set.add(s.charAt(right));
            res = Math.max(res, right - left + 1);
        }
        return res;
    }

}
