package RecursionArray;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
//here we are creating a copy of the existing array hence the original array is not modified so we need to store the answer in hte new arr object coz the exisitng arr wont be modified as it is returning a new array..
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));// gets the left part of the array
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));// gets the right part of the array
        //once all the above function calls for left and right mergeSort are made it finally goes into the return statement where the left and right part of the array are sorted and merged
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        // creating a new array which contains the merged part of first and second part of the array
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;
// runs till one of the divided arrays iteration is completed
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
//if either of the array has completed its iteration now the other array needs to add its elemets via different loop
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
