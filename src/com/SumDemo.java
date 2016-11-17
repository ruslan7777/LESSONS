package com;

/**
 * Created by RUSLAN77 on  17.11.2016 in Ukraine  * Перегрузка конструкторов чаще всего используется для того, чтобы дать возможность
 * инициализировать один объект на основании другого объекта. Рассмотрим в качестве  примера следующую программу, в которой класс Surnmation
 * используется для вычисления  суммы двух целочисленных значений.
 */

// Инициализация одного объекта посредством другого
class Summation {
    int sum;

    // Создать объект на основе целочисленного значения
    Summation(int num) {
        sum = 0;
        for (int i = 1; i <= num; i++)
            sum += i;
    }

    // Создать один объект на основе другого
    Summation(Summation ob) {
        sum = ob.sum;
    }
}


public class SumDemo {
    public static void main(String[] args) {
        Summation sl = new Summation(5);
        Summation s2 = new Summation(sl);
        System.out.println("sl.sum: " + sl.sum);
        System.out.println("s2.sum: " + s2.sum);

    }
}


