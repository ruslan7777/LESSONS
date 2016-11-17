package com;

/* Created by RUSLAN77 on  17.11.2016 in Ukraine
 Автоматическое преобразование типов может влиять  на выбор перегружаемого метода.
 В данном примере определены только два варианта метода f () : один принимает параметр типа int, а второй - параметр типа double.
  Но передать методу f () можно также значение типа byte, short и float.
 Значения типа byte и short исполняющая система Java автоматически преобразует в тип int. В результате будет вызван вариант
 метода f (int).
 А если параметр имеет значение типа float, то оно преобразуется в тип double, и далее вызывается вариант метода f (double).

 Важно понимать, что автоматическое преобразование типов выполняется лишь в отсутствие прямого соответствия типов параметра и аргумента!!!
 */
class Overload2 {
    void f(int x) {
        System.out.println("Bнyтpи f(int): " + x);
    }

    void f(double x) {
        System.out.println("Bнyтpи f(double): " + x);
    }

}

public class TypeConv {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();
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
