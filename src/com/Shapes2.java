package com;

/**
 * Created by RUSLAN77 on  25.11.2016 in Ukraine   // Простая иерархия классов
 */
// Использование методов доступа для установки и получения значений закрытых членов.

// Класс, описывающий двумерные объекты
class TwoDShape2 {
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
class Triangle2 extends TwoDShape2 {   //Класс Triangle наследует класс TwoDShape
    String style;

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

public class Shapes2 {
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2();
        Triangle2 t2 = new Triangle2();

        //Объектам типа Triangle доступны все члены класса Triangle, даже те, которые унаследованы от класса TwoDShape
        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "закрашенный";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "контурный";

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
