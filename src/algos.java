package io.wolfinger.algos;

import io.wolfinger.algos.search.Binary;

class Algos {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 8, 12, 18, 24, 52, 103};

        int[] searchRet;

        searchRet = Binary.search(arr, 6);

        System.out.println(searchRet[0] + ", " + searchRet[1]);
    }

}