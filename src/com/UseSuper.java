package com;

/**
 * Created by RUSLAN77 on  28.11.2016 in Ukraine
 * // Использование ключевого слова super для предотвращения сокрытия имен
 */
class A {
    int i;

//    public void show1() {
//        System.out.println("i в суперклассе: " + i);
//        System.out.println("i в подклассе: " + i);
//
//    }
}

// Создать подкласс, расширяющий класс А
class B extends A {
    int i;  //эта переменная i скрывает переменную i из класса А

    B(int a, int b) {
        super.i = a;   //переменная i из класса А  ----Здесь super.i ссылается на переменную i класса А
        i = b;        // переменная i из класса В
    }

    void show() {
        System.out.println("i в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);

        A Ob = new B(10, 11);/* todo
                              Тип ссылки здесь равен "А". Тип объекта созданного равен "В". Передали в конструктор объекта "В" два параметра. Имя переменной,
                              в  которой будет хранится объект "В" равно 'Ob'.*/


        subOb.show();

//        Ob.show1();

    }
}
