package org.pop;

import java.util.Arrays;

public class Main {
    public static int SIZE = 10;

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = i;
        }

        try {
            IndexStorage indexStorage = new IndexStorage(SIZE);
            System.out.println("REVERSED indexStorage:");
            System.out.println(Arrays.toString(indexStorage.reverse()));

            ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(array);

            System.out.println("arrayIndexStorage:");
            System.out.println(Arrays.toString(arrayIndexStorage.getArray()));
            System.out.println("REVERSED arrayIndexStorage:");
            System.out.println(Arrays.toString(arrayIndexStorage.reverse()));


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
