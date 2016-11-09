package com;

/**
 * Created by RUSLAN77 on  08.11.2016 in Ukraine В этом классе реализуется "отказоустойчивый" массив, предотвращающий ошибки времени выполнения
 */
class FailSoftArray {
    private int a[]; //ссылка на массив
    private int errval; //значение возвращаемое в случае возникновения ошибки при выполнении метода get()
    public int length; // открытая переменная length

    /* Конструктору данного класса передается размер массива и значение, которое должен возвращать метод get() при возникновении ошибки. */
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    // Возвратить значение элемента массива с заданным индексом
    public int get(int index) {
        if (indexOK(index)) return a[index];               //Отслеживание попытки выхода  за границы массива
        return errval;
    }

    // Установить значение элемента с заданным индексом. Если возникнет ошибка, возвратить логическое значение false.
    public boolean put(int index, int val) {
        if (indexOK(index)) {                             //Отслеживание попытки выхода  за границы массива
            a[index] = val;
            return true;
        }
        return false;
    }

    // Вернуть логическое значение true, если индекс  не выходит за границы массива
    private boolean indexOK(int index) {
        return index >= 0 & index < length;
    }
}

// Демонстрация работы с "отказоустойчивым" массивом
public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // Демонстрация корректной обработки ошибок
        System.out.println("Oбpaбoткa ошибок без вывода отчета:");

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);           //Для обращения к элементам массива должны использоваться методы доступа
            if (x != -1) System.out.print(x + " ");
            System.out.print("");
        }
        // Обработать ошибки
        System.out.println();
        System.out.println("\n Oбpaбoткa ошибок с выводом отчета: ");
        for (int i = 0; i < (fs.length * 2); i++)
            if (!fs.put(i, i * 10))
                System.out.println("put Индекс  " + i + " вне допустимого диапазона");

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else

                System.out.println("  get Индекс  " + i + " вне допустимого диапазона");
        }
    }
}
