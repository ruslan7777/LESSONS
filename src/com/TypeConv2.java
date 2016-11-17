package com;

/**
 * Created by RUSLAN77 on  17.11.2016 in Ukraine     // Добавление версии метода f(byte)
 * Важно понимать, что автоматическое преобразование типов выполняется лишь в отсутствие
 * прямого соответствия типов параметра и аргумента.
 * Поскольку в данной программе предусмотрена версия метода f () , которая принимает  параметр типа byte, то при вызове этого метода с аргументом типа
 * byte выполняется  вызов f (byte), и автоматического преобразования типа byte в тип int не происходит.
 *
 * Перегрузка методов поддерживает полиморфизм, поскольку она является одним из способов реализации парадигмы "один интерфейс - множество методов".
 */


class Overload3 {
    void f(byte x) {
        System.out.println("Bнyтpи f(byte): " + x);
    }

    void f(int x) {
        System.out.println("Bнyтpи f(int): " + x);
    }

    void f(double x) {
        System.out.println("Bнyтpи f(double): " + x);
    }

}

public class TypeConv2 {
    public static void main(String[] args) {
        Overload3 ob = new Overload3();
        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5f;
        ob.f(i); // Вызов метода ob.f(int)
        ob.f(d); // Вызов метода ob.f(double)
        ob.f(b); // Вызов метода ob.f(int) с преобразованием типов
        ob.f(s); // Вызов метода ob.f(int) с преобразованием типов
        ob.f(f); // Вызов метода ob.f(douЬle) с преобразованием типов
    }
}
