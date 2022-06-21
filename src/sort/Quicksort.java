package io.wolfinger.algos.sort;

public class Quicksort {
    public static int[] sort(int[] arr) {
        quicksortHelper(arr, 0, arr.length-1);

        return arr;
    }

    private static void quicksortHelper(int[] arr, int left, int right) {
        if (right - left <= 0) {
            return;
        }

        int pivot = partition(arr, left, right);

        quicksortHelper(arr, left, pivot-1);
        quicksortHelper(arr, pivot+1, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int start = left;
        int pivot = right;
        right -= 1;

        while(true) {
            while(arr[left] < arr[pivot]) {
                left += 1;
            }
            while((right >= start) && (arr[right] > arr[pivot])) {
                right -= 1;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left += 1;

            } else {
                break;
            }
        }

        int temp = arr[pivot];
        arr[pivot] = arr[left];
        arr[left] = temp;

        return left;
    }
}
