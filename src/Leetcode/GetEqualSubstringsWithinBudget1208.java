package Leetcode;

public class GetEqualSubstringsWithinBudget1208 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;
        System.out.println(GetEqualSubstringLength(s, t, maxCost));
    }

    public static int GetEqualSubstringLength(String s, String t, int maxCost) {
        int left = 0, right = 0;
        int ans = 0, window = 0;

        for (right = 0; right < s.length(); right++) {
            window += Math.abs(s.charAt(right) - t.charAt(right));
            while (window > maxCost) {
                window -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
