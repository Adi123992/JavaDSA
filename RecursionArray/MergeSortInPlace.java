package RecursionArray;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 3};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr)); // will print sorted array
    }

    // In-place merge sort: sorts arr[start...end-1]
    static void mergeSort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return; // single element is already sorted
        }

        int mid = start + (end - start) / 2;

        // Sort left and right parts
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        // Merge them in-place
        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start]; // temporary array to hold merged values

        int i = start;
        int j = mid;
        int k = 0;

        // Merge two sorted halves
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        // Copy remaining elements
        while (i < mid) {
            mix[k++] = arr[i++];
        }

        while (j < end) {
            mix[k++] = arr[j++];
        }

        // Copy back to the original array
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}

