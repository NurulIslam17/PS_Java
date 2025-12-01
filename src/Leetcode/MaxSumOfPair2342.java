package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaxSumOfPair2342 {
    public static void main(String[] args) {
        int[] nums = {18, 43, 36, 13, 7};
        System.out.println(maximumSum(nums));
    }

    public static int maximumSum(int[] nums) {
        int res = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int digitSum = digitSum(nums[i]);
            if (map.containsKey(digitSum)) {
                res = Math.max(res, nums[i] + map.get(digitSum));
                if (nums[i] > map.get(digitSum)) {
                    map.put(digitSum, nums[i]);
                }
            } else {
                map.put(digitSum, nums[i]);
            }
        }
        return res;
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            int last = n % 10;
            sum += last;
            n = n / 10;
        }
        return sum;
    }
}
