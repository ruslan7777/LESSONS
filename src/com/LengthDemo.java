package com;
/**
 * Created by RUSLAN77 on  14.10.2016 in Ukraine
 */
public class LengthDemo {
    public static void main(String[] args) {
        int list[]=new int[10];
        int nums[]={1,2,3};
        int table [][]={         // таблица со строками переменной длины
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        System.out.println("Paзмep list: " + list.length);
        System.out.println("Paзмep nums: " + nums.length);
        System.out.println("Paзмep tаblе: " +table.length);
        System.out.println("Paзмep tаblе[0]: " + table[0] .length);
        System.out.println("Paзмep table[l]: " + table[1] .length);
        System.out.println("Paзмep tаblе[2]: " + table[2] .length);
        System.out.println();

        // Использовать переменную length для инициализации списка  (для управления циклом for)
        for(int i=0; i < list.length; i++)
            list[i] = i * i;
        System.out.println("Содержимое списка: ");

        for(int i=0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}

/*for (int aList : list) System.out.print(aList + " ");
        System.out.println();*/
/*Обратите внимание на то, каким образом переменная length используется в двумерном
массиве. Как пояснялось ранее, двумерный массив представляет собой массив массивов.
Поэтому приведенное ниже выражение позволяет определить число массивов,
содержащихся в массиве tаЫе: taЫe.length Число таких массивов равно 3.
Для того чтобы получить размер отдельного массива,
содержащегося в массиве tаЫе, потребуется выражение, аналогичное следующему:
tаЫе[О] .length
Это выражение возвращает размер первого массива.*/