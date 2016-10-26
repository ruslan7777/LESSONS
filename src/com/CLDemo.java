
package com;

/**
 * Created by RUSLAN77 on  26.10.2016 in Ukraine
 */
// todo Отображение всех данных, указываемых в командной строке
class CLDemo {
    public static void main(String args[]) {
        System.out.println("Пpoгpaммe передано " + args.length +
                " аргументов командной строки.");
        System.out.println("Cnиcoк аргументов: ");
        for (int i = 0; i < args.length; i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}