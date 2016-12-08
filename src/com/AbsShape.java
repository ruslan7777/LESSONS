package com;

/**
 * Created by RUSLAN77 on  08.12.2016 in Ukraine
 * Используя абстрактный класс, мы можем усовершенствовать рассмотренный ранее класс TwoDShape. Для неопределенной двумерной геометрической фигуры понятие площади
 * не имеет смысла, поэтому в приведенной ниже версии программы метод area () и сам класс TwoDShape объявляются как абстрактные. Это, конечно, означает, что любой
 * класс, наследующий класс TwoDShape, должен переопределить метод area () .
 */

// Создание абстрактного класса
abstract class TwoDShape9 {
    private double width;
    private double height;
    private String name;

    // Конструктор по умолчанию
//    TwoDShape9() {
//        width = height = 0.0;
//        name = "none";
//    }

    // Параметризированный конструктор
    TwoDShape9(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Создать объект с одинаковыми значениями
// переменных экземпляра width и height
    TwoDShape9(double х, String n) {
        width = height = х;
        name = n;
    }

    // Создать один объект на основе другого
    TwoDShape9(TwoDShape9 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Методы доступа к переменным width и height
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

//    void setWidth(double w) {
//        width = w;
//    }
//
//    void setHeight(double h) {
//        height = h;
//    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Шиpинa и высота - " + width + " и " + height);
    }

    // Теперь метод area() абстрактный
    abstract double area();
}

// Подкласс для представления треугольников, производный от класса TwoDShape
class Triangle9 extends TwoDShape9 {
    private String style;

    // Конструктор по умолчанию
//    Triangle9() {
//        super();
//        style = "none";
//    }

    // Конструктор класса Triangle
    Triangle9(String s, double w, double h) {
        super(w, h, "треугольник");
        style = s;
    }

    // Конструктор с одним аргументом для построения треугольника
    Triangle9(double x) {
        super(x, "треугольник"); // вызвать конструктор суперкласса
        style = "закрашенный";
    }

    // Создать один объект на основе другого
//    Triangle9(Triangle9 ob) {
//        super(ob); // передать объект конструктору класса TwoDShape
//        style = ob.style;
//    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

//    void showStyle() {
//        System.out.println("Tpeyгoльник " + style);
//    }
}

// Подкласс для представления прямоугольников, производный от класса TwoDShape
class Rectangle9 extends TwoDShape9 {

//    // Конструктор по умолчанию
//    Rectangle9() {
//        super();
//    }

    // Конструктор класса Rectangle
    Rectangle9(double w, double h) {
        super(w, h, "прямоугольник"); // вызвать конструктор суперкласса
    }

    // Создать квадрат
    Rectangle9(double x) {
        super(x, "прямоугольник"); // вызвать конструктор суперкласса
    }

    // Создать один объект на основе другого
//    Rectangle9(Rectangle9 ob) {
//        super(ob); // передать объект конструктору класса TwoDShape
//    }

//    boolean isSquare() {
//        return getWidth() == getHeight();
//    }

    double area() {
        return getWidth() * getHeight();
    }
}

public class AbsShape {
    public static void main(String[] args) {
        TwoDShape9 shapes[] = new TwoDShape9[4];
        shapes[0] = new Triangle9("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle9(10);
        shapes[2] = new Rectangle9(10, 4);
        shapes[3] = new Triangle9(7.0);

        for (TwoDShape9 shape : shapes) {
            System.out.println("Oбъeкт - " + shape.getName());
            System.out.println("Плoщaдь - " + shape.area());
            System.out.println();
        }
    }
}
/*Как видно из текста программы, все классы, наследующие класс TwoDShape, должны переопределять метод area (). Вы можете убедиться в этом самостоятельно, попытавшись
создать подкласс, в котором метод area () не переопределен. В итоrе вы получите сообщение об ошибке во время компиляции. Разумеется, возможность создания объектной
ссылки типа TwoDShape, что и было сделано в приведенном выше примере программы, у вас остается, но объявить объект типа TwoDShape вы уже не сможете. Именно
поэтому массив shapes в методе main () сокращен до четырех элементов, а объект типа TwoDShape для абстрактной двумерной rеометрической фиrуры больше не создается.
И еще одно, последнее замечание. Обратите внимание на то, что в классе TwoDShape по-прежнему определяются методы showDim () и getName () без модификатора
abstract. Ничеrо предосудительною в этом нет, поскольку допускается (и это часто используется на практике), чтобы абстрактные классы включали в себя конкретные методы, к которым подклассы моrут обращаться в своем исходном коде. Переопределению вподклассах подлежат лишь те методы, которые объявлены как abstract.*/