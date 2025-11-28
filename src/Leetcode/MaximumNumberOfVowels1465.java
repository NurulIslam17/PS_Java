package Leetcode;

public class MaximumNumberOfVowels1465 {
    public static void main(String[] args) {
        String  s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s,k));
    }

    public static int maxVowels(String s, int k)
    {
        int l =0;
        int r = 0;
        int res = 0;
        int window = 0;

        for (r = 0; r < k; r++) {
            window += isVowel(s.charAt(r));
        }
        res = window;
        while (r < s.length())
        {
            window -= isVowel(s.charAt(l++));
            window += isVowel(s.charAt(r++));
            res = Math.max(res,window);
        }
        return res;
    }

    private static int isVowel(char c)
    {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c== 'u') ? 1 : 0;
    }
}
