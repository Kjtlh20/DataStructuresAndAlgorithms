package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 9, 2, 8, 3, 7, 4, 6, 5};
        int element = 4;
        System.out.println(Arrays.toString(array));
        int index = linearSearch(array, element);
        System.out.println("element " + element + " at index " + index);
    }

    public static int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
