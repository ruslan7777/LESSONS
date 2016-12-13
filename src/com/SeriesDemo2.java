package com;

/**
 * Created by RUSLAN77 on  12.12.2016 in Ukraine
 * Применение интерфейсных ссылок
 Как это ни покажется странным, но в Java допускается объявлять переменные ссылочного интерфейсного типа, т.е. переменные ссылки на интерфейс. Такая переменная может ссылаться на любой объект, реализующий ее интерфейс. При вызове метода для объекта по интерфейсной ссылке выполняется вариант этого метода, реализованный в классе данного объекта. Этот процесс аналогичен применению ссылки на суперкласс для доступа к объекту подкласса, как пояснялось в главе 7.

 Ниже приведен пример программы, демонстрирующий применение интерфейсной ссылки. По такой ссылке в данной программе будут вызываться методы, принадлежащие классам ByTwos и ByThrees.
 */
// Применение интерфейсных ссылок,
class ByTwos2 implements Series {
    int start;
    int val;

    ByTwos2() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class ByThrees2 implements Series {
    int start;
    int val;

    ByThrees2()  {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class SeriesDemo2 {
    public static void main(String args[])  {
        ByTwos2 twoOb = new ByTwos2();
        ByThrees2 threeOb = new ByThrees2();
        Series ob;

        for(int i=0; i < 5; i++) {
            ob = twoOb;
            // Обращение к объекту по интерфейсной ссылке.
            System.out.println("Next ByTwos value is " +ob.getNext());

            ob = threeOb;
            // Обращение к объекту по интерфейсной ссылке.
            System.out.println("Next ByThrees value is " + ob.getNext());

            }
    }
}
/*В методе main() переменная ob объявляется как ссылка на интерфейс Series. Это означает, что в данной переменной может храниться ссылка на любой объект, реализующий интерфейс Series.
 В данном случае в переменной ob сохраняется ссылка на объекты twoOb и threeOb, т.е. в разные моменты времени переменная представляет собой ссылку на объект класса ByTwos или же на объект класса ByThrees. Оба эти класса реализуют интерфейс Series.
  Переменная ссылки на интерфейс содержит сведения только о методах, объявленных в этом интерфейсе. Следовательно, переменная ob не может быть использована для доступа к любым другим переменным и методам, которые поддерживаются в объекте, но не объявлены в интерфейсе.*/