package io.wolfinger.algos.sort;

import io.wolfinger.algos.sort.Quicksort;

public class Quickselect extends Quicksort {
    public static int select(int[] arr, int k) {
        return quickSelectHelper(arr.clone(), 0,arr.length-1, k);
    }

    private static int quickSelectHelper(int[] arr, int left, int right, int k) {
        if ((right - left) <= 0) {
            return arr[left];
        }

        int pivot = Quickselect.partition(arr, left, right);

        if (k < pivot) {
            return quickSelectHelper(arr, left, pivot-1, k);
        } else if (k > pivot) {
            return quickSelectHelper(arr,pivot+1, right, k);
        } else {
            return arr[pivot];
        }
    }
}
