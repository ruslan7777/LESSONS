package com;

/**
 * Created by RUSLAN77 on  06.11.2016 in Ukraine
 */
public class page_202 {
    public static void main(String[] args) {
//        double sample[] = new double[12];
//        double[] sample2 = new double[12];


//        int simple[] = {1, 2, 3, 4, 5};


//        double sample[] = {2.2, 23.22, 55.6, 556.98, 151.54, 1121.22, 748.564, 929.45, 1212.555, 1121.22};
//        double sum = 0;
//        for (int i = 0; i < sample.length; i++) {
//                        sum += sample [i];
//        }
//        System.out.println( sum/ sample.length);


//        String strs[] = {
//                "this", "is", "a", "of", "а", "string", "sort"
//        };
//
//        int a, b;
//        String t;
//        int size;
//        size = strs.length; // количество сортируемых элементов
//
//        // Отобразить исходный массив
//        System.out.print("Иcxoдный массив:");
//        for (int i = 0; i < size; i++)
//            System.out.print(" " + strs[i]);
//        System.out.println();
//
//        // Пузырьковая сортировка строк
//        for (a = 1; a < size; a++)
//            for (b = size - 1; b >= a; b--) {
//                // поменять элементы местами при нарушении порядка их следования
//                if (strs[b - 1].compareTo(strs[b]) > 0) {
//                    t = strs[b - 1];
//                    strs[b - 1] = strs[b];
//                    strs[b] = t;
//                }
//            }
//        // Отобразить отсортированный массив
//        System.out.print("Oтcopтиpoвaнный массив:");
//        for (int i = 0; i < size; i++)
//            System.out.print(" " + strs[i]);
//        System.out.println();


//        System.out.println("Mнe нравится Java".length());
//
//        System.out.println("Mнe нравится Java".charAt (2));


        //       y = x < 0 ? 10 : 20;


        // Нахождение минимального и максимального значений в массиве
//Finding minimum and maximum values in the array
        int nums[] = new int[10];
        int min, max;

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;
        min = max = nums[0];


        for (int v : nums) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        System.out.println("min and max: " + min + " " + max);
    }
}


