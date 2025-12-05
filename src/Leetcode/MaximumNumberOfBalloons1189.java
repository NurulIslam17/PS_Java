package Leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons1189 {

    public static void main(String[] args) {
        String text = "nlaebolk0";
        System.out.println(maxNumberOfBalloons(text));
    }

    public static int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        map.put('l', map.getOrDefault('l', 0) / 2);
        map.put('o', map.getOrDefault('o', 0) / 2);
        return Collections.min(map.values());
    }
}
