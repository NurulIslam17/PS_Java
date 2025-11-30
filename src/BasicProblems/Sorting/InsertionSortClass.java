package BasicProblems.Sorting;

public class InsertionSortClass {

    // TC = O(n^2)

    public static void main(String[] args) {
        int[] array = {5, 2, 3, 1, 4};
        insertionSort(array);
    }

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        for (int num : array) {
            System.out.print(" " + num);
        }
    }
}
