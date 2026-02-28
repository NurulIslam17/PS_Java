package codeforce;

import java.util.Scanner;

public class P381A {

    public static void main(String[] args) {
        int n = 4;
        int s = 0;
        int d = 0;
        int[] arr = new int[n];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            arr[i] = input;
        }

        int left = 0, right = n - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[left] > arr[right]) {
                    s += arr[left];
                    ++left;
                } else if (arr[right] > arr[left]) {
                    s += arr[right];
                    --right;
                } else {
                    s += arr[left];

                }
            } else {
                if (arr[left] > arr[right]) {
                    d += arr[left];
                    ++left;
                } else if (arr[right] > arr[left]) {
                    d += arr[right];
                    --right;
                } else {
                    d += arr[left];

                }
            }
        }
        System.out.println(s + " " + d);
        scanner.close();
    }
}
