package BasicProblems.Sorting;

import java.util.Arrays;

public class QuickSortClass {

    public static void main(String[] args) {
        int[] array = {5, 4, 2, 7, 1, 9, 8, 6, 3};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int l, int h) {
        if (l < h) {
            int pivotValueIndex = partition(array, l, h);
            quickSort(array, l, pivotValueIndex);
            quickSort(array, pivotValueIndex + 1, h);
        }
    }

    public static int partition(int[] array, int l, int h) {

        int pivot = array[l];
        int i = l, j = h;

        while (i < j) {
            while (i < h && array[i] <= pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[j];
        array[j] = array[l];
        array[l] = temp;
        return j;
    }
}
