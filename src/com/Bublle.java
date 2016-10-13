package com;
/**
 * Created by RUSLAN77 on  11.10.2016 in Ukraine
 */
//Демонстрация алгоритма пузырьковой сортировки       Demonstration of bubble sort algorithm

public class Bublle {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        int size = 10;  // Количество сортируемых єлементов

        // Отобразить исходный массив
        System.out.print("Иcxoдный массив:");

        for (int i = 0; i < size; i++)
            System.out.print(", " + nums[i]);
        System.out.println();

        // Реализовать алгоритм пузырьковой сортировки     Implement bubble sort algorithm
        for (a=1; a<size; a++)
            for (b=size-1; b>=a; b--){
                if (nums[b-1]>nums[b]){   // если требуемый порядок  следования не соблюдается, поменять элементы местами
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        // Отобразить отсортированный массив
        System.out.print("Oтcopтиpoвaнный массив:");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
