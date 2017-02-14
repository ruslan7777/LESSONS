package com;

/**
 * Created by RUSLAN77 on  13.02.2017 in Ukraine
 */
// Простой обобщенный класс с двумя параметрами типа: Т и V.
class TwoGen<T, V> { // Применение двух параметров типа
    T ob1;
    V ob2;

    // передать конструктору класса ссылки на объекты типов Т и V
    TwoGen(T ol, V o2) {
        ob1 = ol;
        ob2 = o2;
    }

    // отобразить типы Т и V
    void showTypes() {
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }

    T getobl() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}

// продемонстрировать класс TwoGen
class SimpGen {
    public static void main(String args[]) {
        // Здесь в качестве параметра типа Т передается тип
        // Integer, а в качестве параметра типа V - тип String.
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");

        // отобразить конкретные типы
        tgObj.showTypes();

        // получить и отобразить отдельные значения
        int v = tgObj.getobl();
        System.out.println("value: " + v);

        String str = tgObj.getob2();
        System.out.println("value: " + str);
    }
}

/*Обратите внимание на приведенное ниже объявление класса TwoGen.

class TwoGen<T, V> {
Здесь определяются два параметра типа, T и V, разделяемые запятыми. А поскольку в этом классе используются два параметра типа, то при создании его объекта следует непременно указывать оба аргумента типа, как показано ниже.

TwoGen<Integer, String> tgObj =
    new TwoGencinteger, String>(88, "Generics");
В данном случае тип Integer передается в качестве параметра типа T, а тип String — в качестве параметра типа V. И хотя в этом примере аргументы типа отличаются, они могут в принципе и совпадать. Например, следующая строка кода считается вполне допустимой:

TwoGen<String, String> х = new TwoGen<String, String>("A", "В");
В данном случае в качестве обоих параметров типа Т и V передается один и тот же тип String. Очевидно, что если аргументы типа совпадают, то определять два параметра типа в обобщенном классе нет никакой надобности.*/