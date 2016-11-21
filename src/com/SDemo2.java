package com;

/**
 * Created by RUSLAN77 on  21.11.2016 in Ukraine
 */


// Применение статического метода
class StaticMeth {
    static int val = 1024; // статическая переменная

    // Статический метод
    static int valDiv2() {
        return val / 2;
    }
}

public class SDemo2 {
    public static void main(String[] args) {
        System.out.println("Значение val: "+StaticMeth.val);  //Это обращение к статич.переменной
        System.out.println("StaticMeth.valDiv2(): "+StaticMeth.valDiv2());  ////Это обращение к статич.методу

        StaticMeth.val=4;
        System.out.println("Значение val: "+StaticMeth.val);  //Это обращение к статич.переменной
        System.out.println("StaticMeth.valDiv2(): "+StaticMeth.valDiv2());  ////Это обращение к статич.методу

    }
}
