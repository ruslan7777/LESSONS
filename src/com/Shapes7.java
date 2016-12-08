package com;

/**
 * Created by RUSLAN77 on  02.12.2016 in Ukraine *
 * Один из самых важных моментов для присваивания ссылок на объекты подкласса  переменным с типом суперкласса наступает тогда, когда конструкторы вызываются в
 * иерархии классов. Как вам уже должно быть известно, в классе нередко определяется конструктор, принимающий объект своего класса в качестве параметра.
 * Благодаря этому  в классе может быть сконструирована копия объекта. Этой особенностью можно воспользоваться в подклассах, производных от такого класса.
 * В качестве примера рассмотрим описанные ниже версии классов TwoDShape и Triangle.
 * В оба класса добавлены  конструкторы, принимающие объект своего класса в качестве параметра.
 */


class TwoDShape7 {
    private double width;
    private double height;

    //Конструктор по умолчанию
    TwoDShape7() {
        width = height = 0.0;
    }

    //Параметризованный конструктор
    TwoDShape7(double w, double h) {
        width = w;
        height = h;
    }

    // Создать объект с одинаковыми значениями переменных экземпляра width и height
    TwoDShape7(double x) {
        width = height = x;
    }

    // Создать один объект на основе другого
    TwoDShape7(TwoDShape7 ob) { //Создать один объект на основе дpyгого
        width = ob.width;
        height = ob.height;
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

// Подкласс для представления треугольников, производный от класса TwoDShape
class Triangle7 extends TwoDShape7 {
    private String style;

    //Конструктор по умолчанию
    Triangle7() {
        super();
        style = "none";
    }


    // Конструктор класса Triangle
    Triangle7(String s, double w, double h) {
        super(w, h); // вызвать конструктор суперкласса
        style = s;
    }

    // Конструктор с одним аргументом для построения треугольника
    Triangle7(double x) {
        super(x); // вызвать конструктор суперкласса
        style = "закрашенный";
    }

    // Создать один объект на основе другого
    Triangle7(Triangle7 ob) {
        super(ob); // передача объекта конструктору класса TwoDShape (Передать ссылку на объект Triangle  конструктору кпасса TwoDShape)
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Tpeyгoльник " + style);
    }
}

class Shapes7 {
    public static void main(String[] args) {
        Triangle7 t1 = new Triangle7("контурный", 8.0, 12.0);

        // создать копию объекта tl
        Triangle7 t2 = new Triangle7(t1);

        System.out.println("Инфopмaция о tl: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Плoщaдь - " + t1.area());

        System.out.println();

        System.out.println("Инфopмaция о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Плoщaдь - " + t2.area());
    }
}
/*В приведенном выше примере программы объект t2 конструируется на основе объекта tl, и поэтому они идентичны.
* Обратите внимание на конструктор класса Triangle, код которого приведен ниже.
*
// Создать один объект на основе другого
Triangle(Triangle оЬ} {
// передача объекта конструктору класса TwoDShape
super (оЬ);
style = ob.style;

В качестве параметра данному конструктору передается объект Triangle, который затем с помощью вызова super () передается конструктору TwoDShape, как показано
ниже.

// Создать один объект на основе другого
TwoDShape(TwoDShape оЬ}
width = ob.width;
height = ob.height;

Следует заметить, что конструктор TwoDshape () должен получить объект типа TwoDShape, но конструктор Triangle () передает ему объект типа Triangle. Тем не менее
никаких недоразумений не возникает. Ведь, как пояснялось ранее, ссылочная переменная суперкласса может ссылаться на объект подкласса. Следовательно, конструктору
TwoDShape () можно передать ссылку на экземпляр подкласса, производного от класса TwoDShape. Конструктор TwoDShape () инициализирует лишь те части передаваемого
ему объекта подкласса, которые являются членами класса TwoDShape, и поэтому не имеет значения, содержит ли этот объект дополнительные члены, добавленные
в производных подклассах.
* */
