package com;

/**
 * Created by RUSLAN77 on  03.10.2016 in Ukraine
 */
class MyClass {
    int x;

    MyClass() {           //This is the constructor for MyClass.
        x = 10;
    }
}
public class ConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x+ " "+ t2.x  );

    }
}
/*  В этом конструкторе переменной экземплярах, определяемой в классе MyClass,
присваивается значение 10. Этот конструктор вызывается оператором new при создании
объекта данного класса. Ниже приведена строка кода, в которой используется оператор  new.
MyClass tl = new MyClass();
В этой строке кода для объекта tl вызывается конструктор MyClass (), в котором
переменной экземпляра tl.х присваивается значение 10. То же самое происходит и для
 объекта t2. После вызова данного конструктора переменная экземпляра t2.х также получает
значение 10.    */

