package com;

/**
 * Created by RUSLAN77 on  17.11.2016 in Ukraine      // Перегрузка методов
 */
class Overload {
    void ovlDemo() {                        //Первая версия
        System.out.println("No parameters");
    }

    // Перегрузка метода ovlDemo для одного параметра типа int
    void ovlDemo(int a) {                  //Вторая версия
        System.out.println("one parameter " + a);
    }

    // Перегрузка метода ovlDemo для двух параметров типа int
    int ovlDemo(int a, int b) {              //Третья версия
        System.out.println("Two parameters " + a + " " + b);
        return a + b;
    }

    // Перегрузка метода ovlDemo для двух параметров типа douЫe
    double ovlDemo(double a, double b) {              //Четвертая версия
        System.out.println(" Two type parameters double " + a + " " + b);
        return a + b;
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        // Поочередно вызвать все версии метода ovlDemo()
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Call result ob.ov1Demo(4, 6): " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Call result ob.ov1Demo(1.1,2.32): " + resD);
    }
}
