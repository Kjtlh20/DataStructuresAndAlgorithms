package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = getRandomArray();
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int sortedIndex = array.length;
        int numberOfSwap = 1;
        while (numberOfSwap > 0) {
            numberOfSwap = 0;
            for (int i = 0; i < sortedIndex - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    numberOfSwap += 1;
                }
            }
            sortedIndex -= 1;
        }
    }

    public static int[] getRandomArray() {
        Random rn = new Random();
        int size = rn.nextInt(20) + 10;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rn.nextInt(10);
        }
        return array;
    }
}
