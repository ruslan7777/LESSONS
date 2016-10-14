package com;

/**
 * Created by RUSLAN77 on  14.10.2016 in Ukraine
 */
// Выделение памяти по второму индексу массива вручную  Allocation of the second index of the array manually
public class Ragged {
    public static void main(String[] args) {
        int riders[][]=new int[7][];
        riders[0]=new int[10];
        riders[1]=new int[10];
        riders[2]=new int[10];
        riders[3]=new int[10];
        riders[4]=new int[10];
        riders[5]=new int[2];
        riders[6]=new int[2];

        int i,j;

        // Сформировать произвольные данные    Generate random data
        for (i=0; i<5; i++)
            for (j=0; j<10; j++)
                riders[i][j]=i+j+10;
        for(i=5; i < 7; i++)
            for (j=0; j < 2; j++)
                riders[i][j] = i + j + 10;

        System.out.println("Количество пассажиров, перевезенных каждым рейсом, в будние дни недели:");  //Number of passengers carried each flight, on weekdays // the week

        for(i=0; i < 5; i++) {
            for (j = 0; j < 10; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
            System.out.println("Количество пассажиров, перевезенных каждым рейсом, в выходные дни:"); //Number of passengers carried each flight, weekend
            for(i=5; i < 7; i++) {
                for(j=0; j < 2; j++)
                    System.out.print(riders[i][j] + " ");
                System.out.println();
        }
    }
}
