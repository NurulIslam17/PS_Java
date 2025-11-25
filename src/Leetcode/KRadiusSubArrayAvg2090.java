package Leetcode;

import java.util.Arrays;

public class KRadiusSubArrayAvg2090 {

    public static void main(String[] args) {
        int[] arr = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;
        radiusSubArrayAvg(arr, k);
    }

    public static void radiusSubArrayAvg(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,-1);
        int temp_k = k;
        long window = 0;
        int idx = 2 * k + 1;

        if (idx > n)
        {
            return;
        }
        for (int i = 0; i < idx; i++) {
            window +=nums[i];
        }
        res[temp_k] = (int)(window/idx);
        for (int i = idx; i <n ; i++) {
            window = window - nums[i-idx] + nums[i];
            res[++k] = (int)(window/idx);
        }
        System.out.println(Arrays.toString(res));
    }
}
