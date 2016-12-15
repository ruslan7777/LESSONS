package com;
/*Как упоминалось выше, тип исключения должен соответствовать типу, указанному в операторе catch. В противном случае исключение не будет перехвачено. Так, в
 приведенном ниже примере программы делается попытка перехватить исключение, связанное с обращением за границы массива, с помощью оператора catch, в котором
  указан тип ArithmeticException еще одного встроенного в Java исключения. При неправильном обращении к массиву будет сгенерировано исключение
  ArraylndexOutOfBoundsException, не соответствующее типу, указанному в операторе catch. В результате программа будет завершена аварийно.*/

// Эта программа не будет работать нормально
class ExcTypeMismatch {
    public static void main(String args[]) {
        int nums[] = new int[4];
        try {
            System.out.println("Before exception is generated.");
            // При выполнении следующего оператора возникает исключение ArraylndexOutOfBoundsException
            nums[7] = 10;
            System.out.println("this won’t be displayed");
        } catch (ArithmeticException exc) {
            /* Исключение, связанное с обращением за границы массива,нельзя обработать с помощью оператора catch, в котором в котором указан тип исключения ArithmeticException.*/
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
    /*Ниже приведен результат выполнения данной программы.

        Before exception is generated.
        Exception in thread "main" java.lang.ArraylndexOutOfBoundsException: 7
        at ExcTypeMismatch.main(ExcTypeMismatch.java:10)

        Нетрудно заметить, что оператор catch, в котором указан тип исключения ArithmeticException, не может перехватить исключение ArraylndexOutOfBoundsException.*/