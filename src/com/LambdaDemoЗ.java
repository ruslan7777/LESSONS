package com;

/**
 * Created by RUSLAN77 on  17.05.2017 in Ukraine
 */
// Функциональный интерфейс, тестирующий две строки

interface StringTest {
    boolean test(String aSrt, String bStr);
}

class LambdaDemoЗ {
    public static void main(String[] args) {
        // Данное лямбда-выражение определяет, является ли одна строка частью другой
        StringTest isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "Это тест";

        System.out.println("Тестируемая строка:" + str);

        if (isIn.test(str, "Это"))
            System.out.println("'Это' найдено ");
        else
            System.out.println("'Это' не найдено ");
        if (isIn.test(str, "xyz"))
            System.out.println("'xyz' найдено");
        else
            System.out.println("'xyz' не найдено");

    }
}
