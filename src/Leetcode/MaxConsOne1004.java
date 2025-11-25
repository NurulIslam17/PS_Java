package Leetcode;

public class MaxConsOne1004 {

    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1, 0, 1, 0, 1};
        int k = 2;
        System.out.println(cuntOnes(nums, k));
    }

    public static int cuntOnes(int[] nums, int k) {
        int left = 0;
        int count = 0;
        int window = 0;

        for (int right = 0; right < nums.length; right++) {
            window += nums[right];
            while (window + k < right - left + 1) {
                window -= nums[left];
                left++;
            }
            count = Math.max(count, right - left + 1);
        }
        return count;
    }
}
