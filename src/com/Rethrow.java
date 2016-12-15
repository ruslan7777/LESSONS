package com;

/**
 * Исключение, перехваченное блоком catch, может быть повторно сгенерировано для обработки другим аналогичным блоком. Чаще всего повторное генерирование исключений применяется с целью предоставить разным обработчикам доступ к исключению. Так, например, повторное генерирование имеет смысл в том случае, если один обработчик оперирует одним свойством исключения, а другой обработчик ориентирован на другое его свойство. Повторно сгенерированное исключение не может быть перехвачено тем же самым блоком catch. Оно распространяется в другие блоки catch.
 */

// Повторное генерирование исключений
public class Rethrow {
    public static void genException() {

        // Длина массива numer превышает длину массива denom
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
            } catch (ArithmeticException exc) {   // перехватить исключение (деление на ноль)

                System.out.println("Can'not divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException exc) {// перехватить исключение (выход за пределы массива)

                System.out.println("No matching element found.");
                throw exc; // Повторное генерирование исключения.
            }
        }
    }
}

class RethrowDemo {
    public static void main(String args[]) {
        try {
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {  // Перехват повторно сгенерированного включения.
            System.out.println("Fatal error - " + "program terminated.");
        }
    }
}
/*В данной программе ошибка деления на нуль обрабатывается локально в методе genException(), а при попытке обращения за границы массива исключение генерируется повторно. На этот раз оно перехватывается в методе main().*/