package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class NiceSubarrays1248 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        System.out.println(numberOfSubArrays(nums, k));
    }

    // Brute force solution (Not accepting for time limit)
    public static int numberOfSubArrays(int[] nums, int k) {
        int res = 0;
        //        for (int i = 0; i < nums.length; i++) {
        //            int oddNumbers = 0;
        //            int right = i;
        //            while (right < nums.length) {
        //                if (nums[right] % 2 != 0) {
        //                    oddNumbers++;
        //                }
        //                if (oddNumbers == k) {
        //                    res++;
        //                }
        //                right++;
        //            }
        //        }

        int curr = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i : nums) {
            curr += i % 2; // Current will increase only for odd number
            res += map.getOrDefault(curr - k, 0);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        return res;
    }
}
