package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class LuckyInteger1394 {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};
        System.out.println(findLucky(arr));
    }

    public static int findLucky(int[] arr) {
        int res = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i: map.keySet()) {
            if (i == map.get(i)) {
                res = Math.max(res, i);
            }
        }
        return res;
    }
}
