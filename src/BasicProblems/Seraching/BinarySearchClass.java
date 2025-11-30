package BasicProblems.Seraching;

public class BinarySearchClass {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        int result = binarySearch(array, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index : " + result);
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (target > array[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
