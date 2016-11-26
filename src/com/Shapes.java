package com;

/**
 * Created by RUSLAN77 on  25.11.2016 in Ukraine   // Простая иерархия классов
 */
// Класс, описывающий двумерные объекты
class TwoDShape {
    double width;
    double height;

    void showDim() {
        System.out.println("Ширина и высота- " + width + " " + height);
    }
}

// Подкласс для представления треугольников, производный от класса TwoDShape
class Triangle extends TwoDShape {   //Класс Triangle наследует класс TwoDShape
    String style;

    double area() {
        return width * height / 2; //Из класса Triangle можно обращаться к членам  класса ТWoDShape так, как если бы это были eгo собственные члены
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        //Объектам типа Triangle доступны все члены класса Triangle, даже те, которые унаследованы от класса TwoDShape
        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "закрашенный";

        t2.width = 8.0;
        t2.height = 12.0;
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
/*Здесь в классе TwoDShape определены свойства обобщенной двумерной фигуры,частными случаями которой могут быть квадрат, треугольник, прямоугольник и т.п.
Класс Triangle представляет конкретную разновидность класса TwoDShape, в данном случае треугольник. Класс Triangle включает в себя все элементы класса TwoDShape,
а в дополнение к ним - поле style и методы area () и showStyle (). Описание стиля оформления треугольника хранится в переменной экземпляра style. В этой переменной
может храниться любая строка, описывающая треугольник, например "закрашенный", "контурный", "прозрачный", "закрашенный" или "скругленный". Метод area ()
вычисляет и возвращает площадь треугольника, а метод showStyle () отображает стиль оформления треутольника.
В класс Triangle входят все члены суперкласса TwoDShape, и поэтому в теле метода area () доступны переменные экземпляра width и height. Кроме того, объекты tl и t2
в методе main () могут непосредственно обращаться к переменным width и height, какесли бы они принадлежали классу Triangle.

Несмотря на то что TwoDShape является суперклассом для класса Triangle, он по-прежнему остается независимым классом. Тот факт, что один класс является суперклассом
друтого, вовсе не исключает возможности его непосредственного использования.Например, следующий фрагмент кода вполне допустим.
TwoDShape shape = new TwoDShape();
shape.width = 10;
shape.height = 20;
shape. showDim () ;

Разумеется, объекту типа TwoDShape ничего не известно о подклассах своего класса TwoDShape, и он не может к ним обращаться.

Ниже приведена общая форма объявления класса, наследующего суперкласс:
class имя_подкласса extends имя_суперкласса {
// тело класса
}

*/

