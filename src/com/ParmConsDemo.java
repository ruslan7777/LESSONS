package com;

/**
 * Created by RUSLAN77 on  05.10.2016 in Ukraine
 */
class MyClass2{
    int x;

    MyClass2(int i){    //This constructor has a parameter.
        x=i;
    }
}

public class ParmConsDemo {
    public static void main(String[] args) {
        MyClass2 t1=new MyClass2(10);
        MyClass2 t2=new MyClass2(88);
        System.out.println(t1.x+" "+t2.x);

    }
}
/*В данной версии программы в конструкторе класса MyClass определяется единственный
параметр i, который используется для инициализации переменной экземпляра х.
При выполнении следующей строки кода значение 10 сначала передается параметру i
данного конструктора, а затем присваивается переменной х:
MyClass tl = new MyClass(lO);
*/