package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] a = getRandomArray();
        System.out.println(Arrays.toString(a));
    }

    public static int[] selectionSort(int[] a) {
        // TODO
        // add some new code
        return a;
    }

    public static int[] getRandomArray() {
        Random rn = new Random();
        int n = rn.nextInt(20);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rn.nextInt(10);
        }
        return a;
    }
}
