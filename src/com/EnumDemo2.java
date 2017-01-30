package com;

/**
 * Created by RUSLAN77 on  27.01.2017 in Ukraine
 */
// Применение встроенных в перечисление методов. Перечисление разных видов транспорта,
enum Transport2 {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
class EnumDemo2 {
    public static void main(String args[])
    {
        Transport2 tp;

        System.out.println("Here are all Transport2 constants");

        // воспользоваться методом values()
        // Получение массива констант типа Transport.
        //Чтобы        сделать пример более наглядным, в нем создается переменная allTransports, которой    присваивается ссьшка на массив констант перечисления.
//        Transport2 allTransports[] = Transport2.values();
//        for(Transport2 t : allTransports)

        //Но делать это совсем не обязательно, а цикл for можно написать так, как показано ниже.
        // В этом случае необходимость в дополнительной переменной allTransports отпадает.
        for(Transport2 t : Transport2.values())
        System.out.println(t);

        System.out.println();

        // воспользоваться методом valueOf()
        // Получение константы под названием AIRPLANE.
        tp = Transport2.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);
    }
}

/*Обратите также внимание на то, что значение, соответствующее имени AIRPLANE, было получено в результате вызова метода valueOf():
tp = Transport.valueOf("AIRPLANE");
Метод valueOf() возвращает значение перечислимого типа, связанное с именем константы, которое передается в виде символьной строки при вызове этого метода.*/