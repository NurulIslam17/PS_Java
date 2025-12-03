package Leetcode;

public class CharactersEqualNumberOccurrences1941 {
    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println(areOccurrencesEqual(s));
    }

    public static boolean areOccurrencesEqual(String s) {
        int[] charCountMap = new int[26];
        for (char c : s.toCharArray()) {
            charCountMap[c - 'a']++;
        }

        int n = 0;
        for (int i : charCountMap) {
            if (i != 0 && n == 0) {
                n = i;
            } else if (i != 0 && n != i) {
                return false;
            }
        }
        return true;
    }
}
