package BasicProblems.Sorting;

public class SelectionSortClass {

    // TC = O(n^2)
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 1, 7, 5, 6};
        int minIndex = -1;
        selectionSort(array, minIndex);
    }

    public static void selectionSort(int[] array, int minIndex) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        for (int n : array) {
            System.out.print(" " + n);
        }
    }
}
