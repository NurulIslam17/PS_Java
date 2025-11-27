package BasicProblems;

import java.util.Arrays;

public class RemoveDuplicateWithoutExtraSpace {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 5, 5, 6, 7, 7};
        int newLength = removeDuplicates(nums);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
