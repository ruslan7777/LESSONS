package com;

/**
 * Created by RUSLAN77 on  17.11.2016 in Ukraine     Демонстрация перегрузки конструкторов
 */
class MyClass3 {
    int x;

    MyClass3() {
        System.out.println("Inside MyClass3 ()");
        x = 0;
    }

    MyClass3(int i) {
        System.out.println("Inside MyClass3 (int)");
        x = i;
    }

    MyClass3(double d) {
        System.out.println("Inside MyClass3 (double)");
        x = (int) d;
    }

    MyClass3(int i, int j) {
        System.out.println("Inside MyClass3 (int i, int j)");
        x = i * j;
    }

}

class OverloadConsDemo {
    public static void main(String args[]) {

        MyClass3 tl = new MyClass3();
        MyClass3 t2 = new MyClass3(88);
        MyClass3 tЗ = new MyClass3(17.23);
        MyClass3 t4 = new MyClass3(2, 4);

        System.out.println("tl.x: " + tl.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("tЗ.x: " + tЗ.x);
        System.out.println("t4.x: " + t4.x);

    }
}
/*В данном примере конструктор MyClass () перегружается четырежды. Во всех перегруженных версиях этого конструктора объект типа MyClass строится по-разному.
Конкретный вариант конструктора выбирается на основании параметров, которые указываются при выполнении оператора new. Перегружая конструктор класса, вы предоставляете
пользователю созданного вами класса свободу в выборе способа конструирования объекта.
Перегрузка конструкторов чаще всего используется для того, чтобы дать возможность инициализировать один объект на основании другого объекта.*/
