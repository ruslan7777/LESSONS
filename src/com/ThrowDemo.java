package com;

/*генерировать исключения можно и вручную, используя для этого оператор throw. Ниже приведена общая форма этого оператора.

                 throw объект_исключения;
        где объект_исключения должен быть объектом класса, производного от класса Throwable.

        Ниже приведен пример программы, демонстрирующий применение оператора throw. В этой программе исключение ArithmeticException генерируется вручную.*/

// Генерирование исключения вручную
class ThrowDemo {
    public static void main(String args[]) {
        try {
            System.out.println("Before throw.");

            throw new ArithmeticException();// Генерирование исключения.
        } catch (ArithmeticException exc) {  // Перехватить исключение
            System.out.println("Exception caught.");
        }

        System.out.println("After try/catch block.");
    }
}
    /*Обратите внимание на то, что исключение ArithmeticException генерируется с помощью ключевого слова new в операторе throw. Дело в том, что оператор throw
 генерирует исключение в виде объекта.Поэтому после ключевого слова throw недостаточно указать только тип исключения, нужно еще создать объект для  этой цели.*/