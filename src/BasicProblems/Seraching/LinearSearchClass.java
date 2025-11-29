package BasicProblems.Seraching;

public class LinearSearchClass {

    public static void main(String[] args) {
        int[] array = {1,3,2,5,7,4};
        int target = 5;
        int result =  linearSearch(array, target);

        if (result == -1)
        {
            System.out.println("Element not found.");
        }else
        {
            System.out.println("Element found at : "+result);
        }
    }

    public static int linearSearch(int[] array , int target)
    {

        return -1;

    }
}
