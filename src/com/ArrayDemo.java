package com;

/**
 * Created by RUSLAN77 on  09.10.2016 in Ukraine
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        for (i = 0; i < 10; i = i + 1)
            sample[i] = i;

        for (i = 0; i < 10; i = i + 1)

        System.out.println("Элемент [" + i + "]:" + sample[i]);
    }
}
