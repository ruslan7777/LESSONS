package com;

/**
 * Created by RUSLAN77 on  02.06.2017 in Ukraine
 */

// Использование обобщенного функционального интерфейса.
//  Обобщенный функциональный интерфейс с двумя параметрами, который возвращает результат типа boolean
interface SomeTest<T> {
    boolean test(T n, T m); //Обобщенный функциональный интерфейс
}

public class GenericFunctionalinterfaceDemo {
    public static void main(String[] args) {

        // Данное лямбда-выражение определяет, является ли одно целое число делителем другого
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;
        System.out.println();

        if (isFactor.test(10, 2))
            System.out.println("2 является делителем 10");
        System.out.println();

        // Данное лямбда-выражение определяет, является ли одно число типа Double делителем другого
        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;
        if (isFactorD.test(212.0, 4.0))
            System.out.println("4.0 является делителем 212.0");
        System.out.println();

        // Данное лямбда-выражение определяет, является ли одна строка частью другой
        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;
        String str = "Обобщенный функциональный интерфейс";
        System.out.println("Tecтиpyeмaя строка: " + str);
        if (isIn.test(str, "фейс"))
            System.out.println("'фейс' найдено");
        else
            System.out.println("'фейс' не найдено");
    }
}

/*Здесь Т определяет тип обоих параметров метода test ( ) . Это означает, что данный интерфейс совместим с любым лямбда-выражением, принимающим два параметра того же типа и возвращающим результат типа boolean.
Интерфейс SomeTest используется для предоставления ссылок на три типа лямбда-выражений. В первом из них используется тип Integer, во втором - тип
Double, в третьем - тип String. Это позволило использовать один и тот же функциональный интерфейс для ссылок на лямбда-выражения isFactor, isFactorD и isIn. Различаются эти три случая лишь типом аргумента, передаваемого экземпляру SomeTest.*/