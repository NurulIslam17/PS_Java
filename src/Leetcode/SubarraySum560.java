package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum560 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1};
        int k = 4;
        System.out.println(subarraySum(nums, k));
    }

    // Brute force solution;
    //    public static int subarraySum(int[] nums, int k) {
    //        int res = 0;
    //        for (int i = 0; i < nums.length; i++) {
    //            int sum = 0;
    //            for (int j = i; j < nums.length; j++) {
    //                sum += nums[j];
    //                if (sum == k) {
    //                    res++;
    //                }
    //            }
    //        }
    //        return res;
    //    }


    // Optimize solution;
    public static int subarraySum(int[] nums, int k) {

        int res = 0;
        int curSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            curSum += num;
            int diff = curSum - k;
            res += map.getOrDefault(diff, 0);
            map.put(curSum, map.getOrDefault(curSum, 0) + 1);
        }

        return res;
    }
}
