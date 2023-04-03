package DSA.Sorting;

import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1, 0};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {

            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                } else {
                    break;
                }
            }

        }
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
