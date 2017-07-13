package com;

/**
 * Created by RUSLAN77 on  28.03.2017 in Ukraine
 */
// Пример обобщенного интерфейса.

// В этом интерфейсе подразумевается, что реализующий его класс содержит одно или несколько значений,
interface Containment<T> { // обобщенный интерфейс
    // Метод contains() проверяет, содержится ли
    // некоторый элемент в объекте класса,
    // реализующего интерфейс Containment,
    boolean contains(T о);
}

// реализовать интерфейс Containment с помощью массива,
// предназначенного для хранения значений.
// Любой класс, реализующий обобщенный интерфейс,
// также должен быть обобщенным.
class MyClass33<T> implements Containment<T> {
    T[] arrayRef;

    MyClass33(T[] o) {
        arrayRef = o;
    }
    // реализовать метод contains()
    public boolean contains(T o) {
        for(T x : arrayRef)
            if(x.equals(o)) return true;
        return false;
    }
}

class GenlFDemo {
    public static void main(String args[]) {
        Integer x[] = { 1, 2, 3 };

        MyClass33<Integer> ob = new MyClass33<Integer>(x);
        if(ob.contains(2))
            System.out.println("2 is in ob");
        else
            System.out.println("2 is NOT in ob");

        if(ob.contains(5))
            System.out.println("5 is in ob");
        else
            System.out.println("5 is NOT in ob");

        // Следующие строки кода недопустимы, так как объект ob
        // является вариантом реализации интерфейса Containment для
        // типа Integer, а значение 9.25 относится к типу Double.
        // if(ob.contains(9.25)) // Недопустимо!
        // System.out.println("9.25 is in ob"); ~
    }
}