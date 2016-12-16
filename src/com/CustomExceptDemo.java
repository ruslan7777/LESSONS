package com;
/*Несмотря на то, что встроенные в Java исключения позволяют обрабатывать большинство ошибок, механизм обработки исключений не ограничивается только этими ошибками. В частности, можно создавать исключения для обработки потенциальных ошибок в прикладной программе. Создать исключение несложно. Для этого достаточно определить подкласс, производный от класса Exception, который, в свою очередь, является подклассом, порожденным классом Throwable. В создаваемый подкласс не обязательно включать реализацию каких-то методов. Сам факт существования такого подкласса позволяет использовать его в качестве исключения.

В классе Exception не определены новые методы. Он лишь наследует методы, предоставляемые классом Throwable. Таким образом, все исключения, включая и создаваемые вами, содержат методы класса Throwable. Конечно же, вы вольны переопределить в создаваемом вами классе один или несколько методов.

Ниже приведен пример, в котором создается исключение NonlntResultException. Оно генерируется в том случае, если результатом деления двух целых чисел является дробное число. В классе NonlntResultException содержатся два поля, предназначенные для хранения целых чисел, а также конструктор. В нем также переопределен метод toString(), что дает возможность выводить описание исключения с помощью метода println().*/

// Применение специально создаваемого исключения
// Создать исключение
class NonlntResultException extends Exception {
    int n;
    int d;

    NonlntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Result of " + n + " / " + d + " is non-integer.";
    }
}

class CustomExceptDemo {
    public static void main(String args[]) {

        // В массиве numer содержатся нечетные числа,
        int numer[] = {4, 8, 15, 32, 64, 127, 256, 512};
        int denom[] = {2, 0, 4,   4,  0,   8};

        for (int i = 0; i < numer.length; i++) {
            try {
                if ((numer[i] % 2) != 0)
                    throw new NonlntResultException(numer[i], denom[i]);
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);

            } catch (ArithmeticException exc) {
                // перехватить исключение
                System.out.println("Can't divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                // перехватить исключение
                System.out.println("No matching element found.");
            } catch (NonlntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}