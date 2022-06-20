package io.wolfinger.algos.search;

public class Binary {
    public static int[] search(int[] arr, int searchVal) {
        int low, mid, high;

        int arrLen = arr.length;

        if (arrLen == 1) {
            if (arr[0] == searchVal) {
                return new int[]{0, 1};
            } else {
                return new int[]{0, 0};
            }
        }

        low = 0;
        high = arrLen + 1;

        while (low <= high) {
            mid = (high + low) / 2;
            if (arr[mid] == searchVal) {
                return new int[]{mid, 1};
            } else if (searchVal < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (arr[high] == searchVal) {
            return new int[]{high, 1};
        } else if (arr[low] == searchVal) {
            return new int[]{low, 1};
        }

        return new int[]{0, 0};
    }
}