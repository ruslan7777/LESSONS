package com;

/**
 * Created by RUSLAN77 on  11.10.2016 in Ukraine
 */
// Демонстрация использования двумерного массива
class TwoD {
    public static void main(String args[]) {
        int t, i;
        int table[][] = new int[3][4];

        for (t = 0; t < 3; ++t) {
            for (i = 0; i < 4; ++i) {
                table[t][i] = (t * 4) + i + 1;
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }
    }
}