package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs1512 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int i : map.keySet()) {
            res += getPairs(map.get(i));
        }
        return res;
    }

    public static int getPairs(int n) {
        return n * (n - 1) / 2;
    }
}
