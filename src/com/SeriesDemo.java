package com;
/*Ниже приведен пример класса ByTwos, реализующего рассмотренный ранее интерфейс Series. В этом классе формируется последовательный
ряд числовых значений, каждое из которых на два больше предыдущего.

Обратите внимание на то, что методы getNext () , reset () и setStart () объявлены открытыми.
Это нужно сделать непременно, поскольку любой метод интерфейса неявно считается открытым для доступа.*/

// Реализация интерфейса Series,
//class ByTwos implements Series {  //Реализует интерфейс Series
//    int start;
//    int val;
//
//    ByTwos() {
//        start = 0;
//        val = 0;
//    }
//
//    public int getNext() {
//        val += 2;
//        return val;
//    }
//
//    public void reset() {
//        start = 0;
//        val = 0;
//    }
//
//    public void setStart(int x) {
//        start = x;
//        val = x;
//    }
//}

//Ниже приведен пример программы, демонстрирующий применение класса ByTwos.
class SeriesDemo {
    public static void main(String args[]) {
        ByTwos ob = new ByTwos();

        for (int i = 0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());

        System.out.println("\nResetting");
        ob.reset();
        for (int i = 0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());

        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for (int i = 0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());


    }
}





/*Класс, реализующий интерфейс, может содержать дополнительные переменные и методы, что вполне допустимо. Более того, именно так в большинстве случаев и поступают   те, кто программирует на Java. Например, в приведенную ниже версию класса ByТwos добавлен метод getPrevious () , возвращающий предыдущее числовое значение.*/

// Реализация интерфейса Series и добавление метода getPrevious().
class ByTwos implements Series {
    int start;
    int val;
    int prev;

    ByTwos()    {
        start = 0;
        val = 0;
        prev = -2;
    }

    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
        prev = -2;
    }

    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }

    // Добавление метода, не объявленного в интерфейсе Series.
    int getPrevious() {
        return prev;
    }
}
    /*Обратите внимание на то, что для добавления метода getPrevious() пришлось изменить реализацию методов, объявленных в интерфейсе Series. Но сам интерфейс не претерпел никаких изменений. Эти изменения не видны за пределами класса и не влияют на его использование. В этом и состоит одно из преимуществ интерфейсов.*/




    /*Как пояснялось ранее, интерфейс может быть реализован каким угодно количеством классов. В качестве примера ниже приведен код класса ByThrees. Этот класс формирует последовательный ряд числовых значений, каждое из которых на три больше предыдущего.*/

// Еще одна реализация интерфейса Series,
class ByThrees implements Series {
    int start;
    int val;

    ByThrees() {
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
/*Следует также иметь в виду, что если в определении класса имеется ключевое слово implements, но он не реализует все методы указанного интерфейса, то этот класс должен быть объявлен абстрактным (abstract). Объект такого класса создать нельзя, но его можно использовать в качестве суперкласса, а завершить реализацию методов интерфейса в его подклассах.*/