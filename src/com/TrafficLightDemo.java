package com;

/**
 * Created by RUSLAN77 on  30.01.2017 in Ukraine
 * Заметьте, что класс TrafficLightSimulator реализует интерфейс RunnaЬle. Это
 * необходимо, поскольку для переключения цветов светофора будет использоваться
 * отдельный поток.
 * Для класса TrafficLightSimulator определены два конструктора.
 * Первый из них позволяет задать начальный цвет светофора, второй устанавливает
 * для светофора красный цвет по умолчанию. В обоих конструкторах запускается
 * новый поток, предназначенный для управления переключением цветов.
 * Далее рассмотрим переменные экземrmяра.
 * Ссылка на поток, регулирующий состояние светофора, хранится в переменной thrd.
 * Информация о текущем цвете  хранится в переменной tlc.
 * Переменная stop служит для остановки имитации. * Первоначально она принимает значение false. Имитация светофора будет действовать
 * до тех пор, пока эта переменная не примет логическое значение true.
 * И наконец, переменная changed принимает значение true при переключении светофора, когда его цвет меняется.
 */
// Имитация автоматизированного светофора с помощью перечисления, описывающего переключаемые цвета светофора.

// Перечисление, представляющее состояния светофора
//Каждая из констант в этом перечислении соответствует определенному цвету светофора.
enum TrafficLightColor {
    RED, GREEN, YELLOW
}

// Имитация автоматизированного светофора,
class TrafficLightSimulator implements Runnable {
    private Thread thrd; // Поток для имитации светофора
    private TrafficLightColor tic; // Текущий цвет светофора
    boolean stop = false; // Остановка имитации, если истинно  (т.е. если true)
    boolean changed = false; // Переключение светофора, если истинно (т.е. если true)

    TrafficLightSimulator(TrafficLightColor init) {
        tic = init;

        thrd = new Thread(this);
        thrd.start();
    }

//    TrafficLightSimulator() {                 // Этот конструктор будет использоваться в программе если в строке 123 убрать TrafficLightColor.GREEN в конструкторе ,
// и будет устанавливать для светофора красный цвет по умолчанию!
//        tic = TrafficLightColor.RED;
//
//        thrd = new Thread(this);
//        thrd.start();
//    }

    // Запуск имитации автоматизированного светофора,
    public void run() {
        while (!stop) {

            try {
                switch (tic) {
                    case GREEN:
                        Thread.sleep(2000); // Зеленый на 2 секунды
                        break;
                    case YELLOW:
                        Thread.sleep(2000); // Желтый на 2 секундыы
                        break;
                    case RED:
                        Thread.sleep(2000); // Красный на 2 секунды
                        break;
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    // Переключение цвета светофора
    /*В операторе switch проверяется информация о цвете светофора, хранящаяся
в переменной tlc, после чего этой переменной присваивается другой цвет.
Обратите внимание на то, что этот метод синхронизирован. Это необходимо было
сделать потому, что он вызывает метод notify (), уведомляющий о смене цвета.
(Напомним, что обратиться к методу notify () можно только из синхронизированного контекста.)*/
    synchronized void changeColor() {

        switch (tic) {
            case RED:
                tic = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tic = TrafficLightColor.RED;
                break;
            case GREEN:
                tic = TrafficLightColor.YELLOW;
        }

        changed = true;
        notify(); // уведомить о переключении цвета светофора
    }

    // Ожидание переключения цвета светофора.
    /*Действие этого метода ограничивается вызовом метода wait () . Возврат из него
не произойдет до тех пор, пока в методе changeColor () не будет вызван метод
notify (). Следовательно, метод waitForChange () не завершится до переключения
цвета светофора.*/
    synchronized void waitForChange() {
        try {
            while (!changed)
                wait(); // ожидать переключения цвета светофора
            changed = false;
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }

    // Возврат текущего цвета.
    TrafficLightColor getColor() {
        return tic;
    }

    // Прекращение имитации светофора,
    void cancel() {
        stop = true;
    }
}

class TrafficLightDemo {
    public static void main(String args[]) {
        TrafficLightSimulator tl = new TrafficLightSimulator(TrafficLightColor.GREEN);

        for (int i = 0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }
        tl.cancel();
    }
}
/*Обратите внимание на то, что перечисление позволяет сделать исходный код данной программы более структурированным. Светофор может находиться в одном из трех состояний, и для этой цели в перечислении предусмотрены только три константы. Благодаря этому исключается случайное переключение имитируемого светофора в недопустимое состояние.*/