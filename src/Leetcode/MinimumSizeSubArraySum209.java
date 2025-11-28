package Leetcode;

public class MinimumSizeSubArraySum209 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(MinimumSizeSubArraySum(nums, target));
    }

    public static int MinimumSizeSubArraySum(int[] nums, int target) {
        int left = 0;
        int right = 0;
        int answer = nums.length + 1;
        int window = 0;
        for (right = 0; right < nums.length; right++) {
            window += nums[right];
            while (window >= target) {
                answer = Math.min(answer, right - left + 1);
                window -= nums[left++];
            }
        }
        return answer == nums.length + 1 ? 0 : answer;
    }
}
