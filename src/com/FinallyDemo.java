package com;

/**
 * Блок finally выполняется всегда по завершении блока try/catch независимо от того, какое именно условие к этому привело. Следовательно, блок finally получит управление как при нормальной работе программы, так и при возникновении ошибки. Более того, он будет вызван даже в том случае, если в блоке try или в одном из блоков catch будет присутствовать оператор return для немедленного возврата из метода.
 */

class UseFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Receiving " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what; // сгенерировать ошибку деления на нуль
                    break;
                case 1:
                    nums[4] = 4; // сгенерировать ошибку обращения к массиву
                    break;
                case 2:
                    return; // возвратиться из блока try
            }
        } catch (ArithmeticException exc) {
            // перехватить исключение
            System.out.println("Can't divide by Zero!");
            return; // возвратиться из блока catch
        } catch (ArrayIndexOutOfBoundsException exc) {
            // перехватить исключение
            System.out.println("No matching element found.");
        }
        // Этот блок выполняется независимо от того, каким образом завершается блок try/catch.
        finally {
            System.out.println("Leaving try.");
        }
    }
}

class FinallyDemo {
    public static void main(String args[]) {

        for (int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}