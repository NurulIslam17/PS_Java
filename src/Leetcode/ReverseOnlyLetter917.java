package Leetcode;

public class ReverseOnlyLetter917 {

    public static void main(String[] args) {
        String str = "+a+++b-cd_";
        String res = reverseString(str);
        System.out.println(res);
    }

    public static String reverseString(String str) {
        char[] arrString = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (isEnglish(arrString[left])) {
                while (!isEnglish(arrString[right])) {
                    right--;
                }
                char temp = arrString[left];
                arrString[left] = arrString[right];
                arrString[right] = temp;
                right--;
            }
            left++;
        }
        return new String(arrString);
    }

    public static boolean isEnglish(char c) {
        return (65 <= c && c <= 90) || (c >= 97 && c <= 122);
    }

}
