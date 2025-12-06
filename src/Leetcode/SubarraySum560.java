package Leetcode;

public class SubarraySum560 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1};
        int k = 4;
        System.out.println(subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        int res = 0, window = 0, left = 0, right = 0;
        window += nums[left];
        while (right < nums.length-1) {
            if (window == k) {
                res++;
            }
            if (window > k) {
                window -= nums[left++];
                right++;
            }
            window += nums[right++];
            System.out.println(right);
        }
        return res;
    }
}
