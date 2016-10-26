package com;

/**
 * Created by RUSLAN77 on  26.10.2016 in Ukraine
 */
// Демонстрация использования массивов строк
class StringArrays {
    public static void main(String args[]) {
        String strs[] = {"Эта", "строка", "является", "тестом."};
        System.out.println("Иcxoдный массив: ");

        for (String s : strs)
            System.out.print(s + " ");
        System.out.println("\n");

// Изменить строку
        strs[2] = "также является";
        strs[3] = "тестом!";
        System.out.println("Измeнeнный массив: ");
        for (String s : strs)
            System.out.print(s + " ");
    }
}