package com;

/**
 * Created by RUSLAN77 on  09.05.2017 in Ukraine
 */
// Использование одного и того же функционального интерфейса с тремя различными лямбда-выражениями.
// Функциональный интерфейс принимает два параметра типа iпt и возвращает результат типа boolean.

interface NumericTest {
    boolean test(int n, int m);
}

public class LambdaDemo2 {
    public static void main(String[] args) {

        // Данное лямбда-выражение проверяет, кратно ли одно число другому
        NumericTest isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2))
            System.out.println("2 является делителем 10");

        if (isFactor.test(10, 3))
            System.out.println("3 не является делителем 10");
        System.out.println();

        // Данное лямбда-выражение возвращает true, если первый аргумент меньше второго
        NumericTest lessThan = (n, m) -> (n < m);

        if (lessThan.test(2, 10))
            System.out.println("2 меньше 10");
        if (!lessThan.test(10, 2))
            System.out.println("lO не меньше 2");
        System.out.println();

        // Данное лямбда-выражение возвращает true, если оба аргумента равны по абсолютной величине
        NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);

if (absEqual.test(4,-4))
    System.out.println("Aбcoлютныe величины 4 и -4 равны");

        if (!absEqual.test(4,-5))
            System.out.println("Aбcoлютныe величины 4 и -5 не равны");
        System.out.println();
    }
}
