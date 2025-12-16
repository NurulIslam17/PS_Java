package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements1748 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                res += i;
            }
        }
        return res;
    }
}
