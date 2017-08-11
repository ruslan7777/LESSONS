package com;

/**
 * // Использование ссылки на метод экземпляра.
 */

// Функциональный интерфейс для числовых предикатов, которые воздействуют на целочисленные значения
interface IntPredicate2 {
    boolean test(int n);
}
// Данный класс хранит значение типа int и определяет метод  isFactor(), который возвращает значение true, если его аргумент
// является делителем числа, хранящегося в классе

class MyIntNum {
    private int v;

    MyIntNum(int х) {
        v = х;
    }

    int getNum() {
        return v;
    }

    // Возвратить true, если n - делитель v
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}


public class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // Создать ссылку ip на метод isFactor объекта myNum
        IntPredicate2 ip = myNum::isFactor;

        // Использовать ссылку для вызова метода isFactor() через метод test()
        result = ip.test(3);
        if (result) System.out.println("З является делителем " +
                myNum.getNum());

        // Создать ссылку на метод isFactor для объекта myNum2 и использовать ее для вызова метода isFactor() через метод test()
        ip = myNum2::isFactor;
        result = ip.test(3);
        if (!result) System.out.println("З не является делителем " +
                myNum2.getNum());

    }
}