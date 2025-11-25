package Leetcode;

public class MaxConsOnes {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 0, 1, 1, 1, 0};
        System.out.println(maxConsOnesCount(numbers));
    }

    public static int maxConsOnesCount(int[] numbers) {
        int curr_count = 0;
        int max_count = 0;

        for (int i : numbers) {
            if (i == 1) {
                curr_count++;
                max_count = Math.max(max_count, curr_count);
            } else {
                curr_count = 0;
            }
        }
        return max_count;
    }
}
