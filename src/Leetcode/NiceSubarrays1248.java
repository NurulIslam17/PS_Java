package Leetcode;

public class NiceSubarrays1248 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        System.out.println(numberOfSubArrays(nums, k));
    }

    // Brute force solution (Not accepting for time limit)
    public static int numberOfSubArrays(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int oddNumbers = 0;
            int right = i;
            while (right < nums.length) {
                if (nums[right] % 2 != 0) {
                    oddNumbers++;
                }
                if (oddNumbers == k) {
                    res++;
                }
                right++;
            }
        }
        return res;
    }
}
