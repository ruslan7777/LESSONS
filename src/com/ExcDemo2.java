package com;

/*Важно понимать, что исключения отслеживаются во всем коде в блоке try. К их числу относятся исключения, которые могут быть сгенерированы методом, вызываемым из
 блока try. Исключения, возникающие в вызываемом методе, перехватываются операторами в блоке catch, связанном с блоком try. Правда, это произойдет лишь в том
  случае, если метод не обрабатывает исключения самостоятельно. Рассмотрим в качестве примера следующую программу:*/

/* Исключение может быть сгенерировано одним методом,а перехвачено другим. */
class ExcTest {
    // сгенерировать исключение
    static void genException() {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        // Здесь генерируется исключение в связи с обращением за границы массива.
        nums[7] = 10;
        System.out.println("this won't be displayed");
    }
}

class ExcDemo2 {
    public static void main(String args[]) {
        try {
            ExcTest.genException();
        }
        //А здесь исключение перехватывается.
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
    /* Метод genException() вызывается из блока try, и поэтому генерируемое, но не перехватываемое в нем исключение перехватывается далее в блоке catch в методе main(). Если бы метод genException() сам перехватывал исключение, оно вообще не дошло бы до метода main().*/