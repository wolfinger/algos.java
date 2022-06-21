package io.wolfinger.algos;

import java.util.Arrays;
import io.wolfinger.algos.search.Binary;
import io.wolfinger.algos.sort.Bubble;
import io.wolfinger.algos.sort.Selection;
import io.wolfinger.algos.sort.Insertion;
import io.wolfinger.algos.sort.Quicksort;

class Algos {
    public static void main(String[] args) {
        int[] arr = {24, 3, 7, 6, 8, 103, 18, 1, 52, 12};

        // test bubble sort
        // arr = Bubble.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // test selection sort
        // arr = Selection.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // test insertion sort
        // arr = Insertion.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // test quicksort
        arr = Quicksort.sort(arr);
        System.out.println(Arrays.toString(arr));

        // test binary search
        int[] searchRet;
        searchRet = Binary.search(arr, 6);
        System.out.println(searchRet[0] + ", " + searchRet[1]);
    }

}