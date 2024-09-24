package com.deloitte.lab2.ex4;
import java.util.Arrays;

public class Lab2Ex4 {

    public static int[] modifyArray(int[] arr) {
        Arrays.sort(arr);
        
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }

        for (int i = 0; i < j / 2; i++) {
            int tempVar = result[i];
            result[i] = result[j - i - 1];
            result[j - i - 1] = tempVar;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 3, 7, 1};
        int[] modifiedArray = modifyArray(arr);
        System.out.println(Arrays.toString(modifiedArray)); // Output: [7, 5, 3, 2, 1]
    }
}
