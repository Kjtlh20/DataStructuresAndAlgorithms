package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = getRandomArray();
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
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
