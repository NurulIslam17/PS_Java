package BasicProblems.Sorting;

public class BubbleSortClass {

    public static void main(String[] args) {
        int[] array = {2,7,3,4,1,5,6,2};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array)
    {
        int n = array.length-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i ; j++) {
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int r : array)
        {
            System.out.print(" "+r);
        }
    }
}
