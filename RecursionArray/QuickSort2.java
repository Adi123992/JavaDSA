package RecursionArray;

import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 6, 3, 7, 2, 5};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {
        if (low >= high) return;
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        //now the pivot is at correct position and it is ready to be sorted hence
        sort(arr, low, e);
        sort(arr, s, high);
        //as far as i have run the test cases the order doesnt matter of function call over here
    }
}
