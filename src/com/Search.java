package com;

/**
 * Created by RUSLAN77 on  25.10.2016 in Ukraine
 */
public class Search {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        // Использовать цикл for-each для поиска значения переменной val в массиве nums
        for (int x : nums) {
            if (x==val){
                found=true;
                break;
            }
        }
        if (found)
            System.out.println("Значение найдено!");

    }
}
