package com;

/**
 * Created by RUSLAN77 on  26.10.2016 in Ukraine
 */
// Простейший автоматизированный телефонный справочник
class Phone {
    public static void main(String args[]) {
        String numbers[][] = {
                {"Tom", "555-3322"},
                {"Mary", "555-8976"},
                {"Jon", "555-1037"},
                {"Rachel", "555-1400"}
        };
        int i;

        // todo Для того чтобы воспользоваться программой, ей нужно передать один аргумент командной строки
        if (args.length != 1)
            System.out.println("Иcпoльзoвaниe: java Phone <имя>");
        else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length)
                System.out.println("Имя не найдено.");
        }
    }
}
