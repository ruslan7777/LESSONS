package com;
/*Вызов super () позволяет вызвать любую форму конструктора, определенную в суперклассе. Для выполнения выбирается тот вариант конструктора, который
 соответствует указанным аргументам. Ниже в качестве примера приведены расширенные версииклассов TwoDShape и Triangle, которые содержат конструкторы
  по умолчанию и конструкторы, принимающие один и более аргументов.
  Использование оператора super () для вызова  разных форм конструктора  TwoDShape ()
*/

// Добавление дополнительных конструкторов в класс TwoDShape
class TwoDShape5 {
    private double width;
    private double height;

    // Конструктор по умолчанию
    TwoDShape5() {           //Конструктор класса TwoDShape
        width = height = 0.0;
    }

    // Параметризированный конструктор
    TwoDShape5(double w, double h) {
        width = w;
        height = h;
    }

    // Конструирование объекта с одинаковыми значениями переменных экземпляра width и height
    TwoDShape5(double х) {
        width = height = х;
    }

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
class Triangle5 extends TwoDShape5 {   //Класс Triangle наследует класс TwoDShape
    private String style;

    //Конструктор по умолчанию
    Triangle5() {
        super(); // вызвать конструктор суперкласса по умолчанию
        style = "none";
    }

    //Конструктор
    Triangle5(String s, double w, double h) {
        super(w, h); // вызвать конструктор суперкласса с двумя аргументами
        style = s;
    }

    //Конструктор с одним аргументом
    Triangle5(double x) {
        super(x);// вызвать конструктор суперкласса с одним аргументом
        style = "закрашенный";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Shapes5 {
    public static void main(String[] args) {
        Triangle5 t1 = new Triangle5();
        Triangle5 t2 = new Triangle5("контурный", 8.0, 12.0);
        Triangle5 t3 = new Triangle5(4.0);

        t1 = t2;

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

        System.out.println();

        System.out.println("Information about t3:");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area " + t3.area());
    }
}


