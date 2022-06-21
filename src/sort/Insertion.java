package io.wolfinger.algos.sort;

public class Insertion {
    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tempVal = arr[i];
            int j = i - 1;

            while (j >= 0) {
                if (arr[j] > tempVal) {
                    arr[j+1] = arr[j];
                    j -= 1;
                } else {
                    break;
                }
            }

            arr[j+1] = tempVal;
        }

        return arr;
    }
}
