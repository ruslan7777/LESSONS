package com;

/**
 * Если конструктор определен только в подклассе, то все происходит очень просто: конструируется объект подкласса, а родительская часть объекта автоматически
 * создается конструктором суперкласса, используемым по умолчанию. В качестве примера рассмотрим приведенный ниже переработанный вариант класса Triangle, в
 * котором определяется собственный конструктор, в связи с чем член style этого класса делается закрытым.
 */

// Добавление конструктора в класс Triangle.

// Класс, описывающий двумерные объекты
class TwoDShape3 {
    private double width;      //теперь эти переменные объявлены как закрытые
    private double height;    //теперь эти переменные объявлены как закрытые

    // Методы доступа к закрытым переменным  экземпляра width и height
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Ширина и высота- " + width + " " + height);
    }
}

// Подкласс для представления треугольников, производный от класса TwoDShape
class Triangle3 extends TwoDShape3 {   //Класс Triangle наследует класс TwoDShape
    private String style;

    // Конструктор класса Triangle инициализирует как собственное поле style, так  и унаследованные члены класса TwoDClass
    Triangle3(String s, double w, double h) {
        setWidth(w);
        setHeight(h);  //Иннициализация части объекта, соответствующей классу TwoDShape

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Shapes3 {
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3("закрашенный", 4.0, 8.0);
        Triangle3 t2 = new Triangle3("контурный", 8.0, 12.0);

        //Объектам типа Triangle доступны все члены класса Triangle, даже те, которые унаследованы от класса TwoDShape
        System.out.println("Information about t1:");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area " + t1.area());

        System.out.println();

        System.out.println("Information about t2:");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area " + t2.area());
    }
}

