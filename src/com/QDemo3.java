package com;

/*todo
Этом проекте предстоит усовершенствовать класс Queue, добавив в него два дополнительных конструктора. В первом из них новая очередь
будет конструироваться на основе уже существующей, а во втором - начальные значения элементов очереди будут присваиваться при ее конструировании. Как станет
ясно в дальнейшем, добавление этих конструкторов сделает класс Queue более удобным для использования.

Класс, реализующий очередь для хранения символов*/
class Queue3 {
    private char q[];                      // массив для хранения элементов очереди
    private int putloc, getloc;            // индексы для вставки (putloc) и извлечения (getloc) элементов очереди

    // Сконструировать пустую очередь заданного размера
    Queue3(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    /*Описание конструктора: Сначала переменные putloc и getloc инициализируются значениями, содержащимися в объекте оЬ,который передается в качестве параметра.
     Затем организуется новый массив для хранения элементов очереди, которые далее копируются из объекта оЬ в этот массив. Вновь созданная
     копия очереди будет идентична оригиналу, хотя они и являются совершенно отдельными объектами.
      Сконструировать очередь на основе имеющегося объекта Queue3*/
    Queue3(Queue3 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // Копировать элементы в очередь
        for (int i = getloc + 1; i <= putloc; i++)
            q[i] = ob.q[i];
    }
    // Сконструировать очередь на основе массива исходных значений
    Queue3(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];
        for (int i = 0; i < a.length; i++) put(a[i]);
    }


    // Поместить символ в очередь
    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    // Извлечь символ из очереди
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}


// Продемонстрировать использование класса Queue3
class QDemo3 {
    public static void main(String args[]) {
// Создать пустую очередь для хранения 10 элементов
        Queue3 ql = new Queue3(10);
        char name[] = {'Т', 'о', 'm'};
// Создать очередь на основе массива
        Queue3 q2 = new Queue3(name);
        char ch;
        int i;
// Поместить ряд символов в очередь ql
        for (i = 0; i < 10; i++)
            ql.put((char) ('А' + i));
// Создать одну очередь на основе другой
        Queue3 qЗ = new Queue3(ql);
// Показать очереди
        System.out.print("Coдepжимoe ql: ");
        for (i = 0; i < 10; i++) {
            ch = ql.get();
            System.out.print(ch);
        }

        System.out.println("\n");
        System.out.print("Coдepжимoe q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Coдepжимoe qЗ: ");
        for (i = 0; i < 10; i++) {
            ch = qЗ.get();
            System.out.print(ch);
        }
    }
}