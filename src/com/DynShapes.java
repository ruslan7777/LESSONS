package com;

/**
 * Created by RUSLAN77 on  08.12.2016 in Ukraine
 * * Для тоrо чтобы стало понятнее, насколько эффективным является механизм переопределения методов продемонстрируем ero применение на примере класса TwoDShape.
 * В приведенных ранее примерах в каждом классе, наследующем класс TwoDShape, определялся метод area (). Теперь мы знаем, что в этом случае имеет смысл включить метод area () в состав класса TwoDShape, позволить каждому ero подклассу переопределить этот метод и, в частности, реализовать вычисление площади в зависимости от конкретного типа геометрической фигуры. Именно такой подход и реализован в приведенном ниже примере программы. Для удобства в класс TwoDShape добавлено поле name. (Это упрощает написание демонстрационной программы.)
 */

// Использование динамической диспетчеризации методов
class TwoDShape8 {
    private double width;
    private double height;
    private String name;

    // Конструктор по умолчанию
//    TwoDShape8() {
//        width = height = 0.0;
//        name = "none";
//    }

    // Параметризированный конструктор
    TwoDShape8(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Создать объект с одинаковыми значениями переменных экземпляра width и height
    TwoDShape8(double х, String n) {
        width = height = х;
        name = n;
    }

    // Создать один объект на основе другого
//    TwoDShape8(TwoDShape8 ob) {
//        width = ob.width;
//        height = ob.height;
//        name = ob.name;
//    }

    // Методы доступа к переменным экземпляра width и height
    //todo  без set!!!!!!!
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
//
//    void showDim() {
//        System.out.println("Шиpинa и высота - " + width + " и " + height);
//    }

    double area() {       //Метод area () определен в классе TwoDShape
        System.out.println("Meтoд area() должен быть переопределен");
        return 0.0;
    }
}

// Подкласс для представления треугольников, производный от класса TwoDShape
class Triangle8 extends TwoDShape8 {
    private String style;

    // Конструктор по умолчанию
//    Triangle8() {
//        super();
//        style = "none";
//    }

    // Конструктор класса Triangle
    Triangle8(String s, double w, double h) {
        super(w, h, "треугольник");
        style = s;
    }

    // Конструктор с одним аргументом для построения треугольника
    Triangle8(double x) {
        super(x, "треугольник"); // вызвать конструктор суперкласса
        style = "закрашенный";
    }

    // Создать один объект на основе другого
//    Triangle8(Triangle8 ob) {
//        super(ob); // передать объект конструктору класса TwoDShape
//        style = ob.style;
//    }

    // Переопределение метода area() для класса Triangle
    double area() {  //Переопределить метод area () дпя класса Triangle
        return getWidth() * getHeight() / 2;
    }

//    void showStyle() {
//        System.out.println("Tpeyгoльник " + style);
//    }
}

// Подкласс для представления прямоугольников, производный от класса TwoDShape
class Rectangle8 extends TwoDShape8 {

    // Конструктор по умолчанию
//    Rectangle8() {
//        super();
//    }

    // Конструктор класса Rectangle
    Rectangle8(double w, double h) {
        super(w, h, "прямоугольник"); // вызвать конструктор суперкласса
    }

    // Создать квадрат
    Rectangle8(double x) {
        super(x, "прямоугольник"); // вызвать конструктор суперкласса
    }

    // Создать один объект на основе другого
//    Rectangle8(Rectangle8 ob) {
//        super(ob); // передать объект конструктору класса TwoDShape
//    }

//    boolean isSquare() {
//        return getWidth() == getHeight();  //БЫЛО if (getWidth() == getHeight()) return true;   return false;
//    }

    // Переопределение метода area() для класса Rectangle
    double area() {    //Переоnредепить метод area () для класса Rectangle
        return getWidth() * getHeight();
    }
}

public class DynShapes {
    public static void main(String[] args) {
        TwoDShape8 shapes[] = new TwoDShape8[5];

        shapes[0] = new Triangle8("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle8(10);
        shapes[2] = new Rectangle8(10, 4);
        shapes[3] = new Triangle8(7.0);
        shapes[4] = new TwoDShape8(10, 20, "фигура");

        //Нужная версия метода area ( )   вызывается для каждой   rеаметрической фиrуры    по отдельностн
        for (TwoDShape8 shape : shapes) {    //БЫЛО for (int i = 0; i < shapes.length; i++) {
            System.out.println("Oбъeкт - " + shape.getName());   //БЫЛО shapes[i].getName())
            System.out.println("Плoщaдь - " + shape.area());      //БЫЛО shapes[i].area())
            System.out.println();
        }
    }
}
/*Рассмотрим код данной программы более подробно. Теперь, как и предполагалось при написании программы, метод area () входит в состав класса TwoDShape и переопределяется в классах Triangle и Rectangle. В классе TwoDShape метод area () играет роль заполнителя и лишь уведомляет пользователя о том, что этот метод должен быть переопределен в подклассе. При каждом переопределении метода area () в нем реализуются средства, необходимые для того типа объекта, который инкапсулируется в подклассе. Так, если требуется реализовать класс для эллипсов, метод area () придется переопределить
таким образом, чтобы он вычислял площадь этой фигуры. Рассматриваемая здесь программа имеет еще одну важную особенность. Обратите
внимание на то, что в методе main () геометрические фигуры объявляются как массив объектов типа TwoDShape. Но на самом деле элементами массива являются ссылки на
объекты Triangle, Rectangle и TwoDShape. Это вполне допустимо. Ведь, как пояснялось ранее, ссылочная переменная суперкласса может ссылаться на объект его подкласса.
В этой программе организован перебор элементов массива в цикле и вывод сведений о каждом объекте. Несмотря на всю простоту данного примера, он наглядно демонстрирует
потенциальные возможности как наследования классов, так и переопределения методов. Тип объекта, на который указывает ссылочная переменная суперкласса,
определяется во время выполнения, что гарантирует правильный выбор версии переопределенного метода. Если объект является производным от класса TwoDShape, то для
вычисления его площади достаточно вызвать метод area (). Интерфейс для выполнения данной операции оказывается общим и не зависит от того, с какой именно геометрической фигурой приходится иметь дело.*/