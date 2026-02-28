package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] sArray = s.split(" ");
        if (pattern.length() != sArray.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            Character pp = pattern.charAt(i);
            String word = sArray[i];
            if (map.containsKey(pp) && !map.get(pp).equals(word) || (!map.containsKey(pp)) && map.values().contains(word)) {
                return false;
            }
            map.put(pp, word);
        }
        return true;
    }

}
