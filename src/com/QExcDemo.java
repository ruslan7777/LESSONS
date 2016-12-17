package com;

 /* Добавление обработчиков исключений в класс очереди.
 Исключение QueueFullException генерируется при попытке поместить элемент в уже заполненную очередь,
 а исключение QueueEmptyException — в ответ на попытку извлечь элемент из пустой очереди. */

// Исключение, указывающее на переполнение очереди,
class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {
        size = s;
    }

    public String toString() {
        return "\nQueue is full. Maximum size is " + size;
    }
}

// Исключение, указывающее на опустошение очереди,
class QueueEmptyException extends Exception {
    public String toString() {
        return "\nQueue is empty.";
    }
}

// Класс, реализующий очередь фиксированного размера для хранения символов.
/*Добавление исключений в класс FixedQueue2 выполняется в два этапа. Сначала в определении методов get() и put() указывается оператор throws с типом генерируемого исключения. А затем в этих методах организуется генерирование исключений при возникновении ошибок. Используя исключения, можно организовать обработку ошибок в вызывающей части программы наиболее рациональным способом. Как вы помните, в предыдущих версиях рассматриваемой здесь программы выводились только сообщения об ошибках. А генерирование исключений является более профессиональным подходом к разработке данной программы.*/

class FixedQueue2 implements ICharQ2 {
    private char q[]; // Массив для хранения элементов очереди,
    private int putloc, getloc; // Индексы размещения и извлечения элементов очереди.

    // создать пустую очередь заданного размера
    public FixedQueue2(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    // поместить символ в очередь
    public void put(char ch)
            throws QueueFullException {

        if (putloc == q.length - 1)
            throw new QueueFullException(q.length - 1);

        putloc++;
        q[putloc] = ch;
    }

    // извлечь символ из очереди
    public char get()
            throws QueueEmptyException {

        if (getloc == putloc)
            throw new QueueEmptyException();

        getloc++;
        return q[getloc];
    }
}

// Демонстрация исключений при обращении с очередью,
class QExcDemo {
    public static void main(String args[]) {
        FixedQueue2 q = new FixedQueue2(10);
        char ch;
        int i;

        try {
            // Переполнение очереди.
            for (i = 0; i < 11; i++) {
                System.out.print("Attempting to store : " +      (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            // Попытка извлечь символ из пустой очереди.
            for (i = 0; i < 11; i++) {
                System.out.print("Getting next char: ");
                ch = q.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}