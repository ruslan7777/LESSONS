package com;

/**
 * Created by RUSLAN77 on  29.11.2016 in Ukraine    // Многоуровневая иерархия
 * Благодаря наследованию в классе ColorTriangle можно использовать ранее определенные классы Triangle и TwoDShape, дополняя их лишь полями, необходимыми для
 * конкретного применения класса ColorTriangle. Таким образом, наследование способствует  повторному использованию кода.
 * Данный пример демонстрирует еще одну важную деталь: вызов super () всегда означает обращение к конструктору ближайшего суперкласса. Иными словами, вызов
 * super () в классе ColorTriangle означает вызов конструктора класса Triangle, а в классе Triangle - вызов конструктора класса TwoDShape. Если в иерархии классов
 * для конструктора суперкласса предусмотрены параметры, то все суперклассы должны передавать их вверх по иерархической структуре. Это правило действует независимого
 * от того, нужны ли параметры самому подклассу или не нужны.
 */
class TwoDShape6 {
    private double width, height;

    // Конструктор по умолчанию
    TwoDShape6() {
        width = height = 0.0;
    }

    // Параметризированный конструктор
    TwoDShape6(double w, double h) {
        width = w;
        height = h;
    }

    // Создать объект с одинаковыми значениями переменных экземпляра width и height
    TwoDShape6(double x) {
        width = height = x;
    }

    // Методы доступа к переменным экземпляра width и height
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
        System.out.println("Шиpинa и высота - " + width + " и " + height);
    }
}

// Расширение класса TwoDShape
class Triangle6 extends TwoDShape6 {
    private String style;

    // Конструктор по умолчанию
    Triangle6() {
        super();
        style = "none";
    }

    Triangle6(String s, double w, double h) {
        super(w, h);//  вызвать конструктор суперкласса
        style = s;
    }

    // Конструктор с одним аргументом для построения треугольника
    Triangle6(double x) {
        super(x);// вызвать конструктор суперкласса
        style = "закрашенный";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

// Расширение класса Triangle
class ColorTriangle extends Triangle6 {  //Кпасс ColorTriangle наследует класс Triangle, nроизводный от кпасса TwoDShape, и поэтому включает все
                                        // члены    класса Triangle и ТWoDShape
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }

    String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Цвет - " + color);
    }
}

public class Shapes6 {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("Cиний", "контурный", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("Красный", "закрашенный", 2.0, 2.0);

        System.out.println("Information about t1:");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area " + t1.area());

        System.out.println();

        System.out.println("Information about t2:");
        t2.showStyle();
        t2.showDim();             //Объект типа ColorTriangle может выэывать как собственные методы, так н методы суnерклассов
        t2.showColor();
        System.out.println("Area " + t2.area());
    }


}
