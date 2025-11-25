package Leetcode;

public class MaxConstOne487 {
    public static void main(String[] args) {
        //    Can replace one zero  by one
        int[] nums = {1, 0, 1, 1, 0, 1,1};
        System.out.println(countOnes(nums));
    }

    public static int countOnes(int[] nums) {
        int left = 0;
        int count = 0;
        int window = 0;

        for (int right = 0; right < nums.length; right++) {
            window += nums[right];
            while (!(window == right - left + 1 || window == right - left)) {
                window -= nums[left];
                left++;
            }
            count = Math.max(count, right - left + 1);
        }
        return count;
    }

}
