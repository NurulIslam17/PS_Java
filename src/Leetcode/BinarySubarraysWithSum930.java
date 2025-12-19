package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class BinarySubarraysWithSum930 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums, goal));
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0, currSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            currSum += num;
            count+=map.getOrDefault(currSum-goal,0);
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }
}
