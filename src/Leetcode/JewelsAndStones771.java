package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones771 {

    public static void main(String[] args) {
        String jewels = "aAc", stones = "aAAbbcCC";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        Set<Character> jeweSet = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            jeweSet.add(c);
        }
        for (char stone : stones.toCharArray()) {
            if (jeweSet.contains(stone)) {
                res++;
            }
        }
        return res;
    }
}
