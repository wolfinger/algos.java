package io.wolfinger.algos.sort;

public class Bubble {
    public static int[] sort(int[] arr) {
        boolean sorted = false;
        int maxIdx = arr.length - 1;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < maxIdx; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    sorted = false;
                }
            }
            maxIdx -= 1;
        }

        return arr;
    }
}
