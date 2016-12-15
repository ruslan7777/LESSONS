package com;

/**
 * В приведенных до сих примерах программ только перехватывались исключения, но не выполнялось никаких действий над представляющими их объектами. В выражении оператора catch указываются тип исключения и параметр, принимающий объект исключения. А поскольку все исключения представлены подклассами, производными от класса Throwable, то они поддерживают методы, определенные в этом классе. Некоторые наиболее употребительные методы из класса Throwable приведены в табл. 9.1.
 * <p>
 * - Throwable fillInStackTrace()	Возвращает объект типа Throwable, содержащий полную трассировку стека исключений. Этот объект пригоден для повторного генерирования исключений
 * -String getLocalizedMessage()	Возвращает описание исключения, локализованное по региональным стандартам
 * -String getMessage()	Возвращает описание исключения
 * -void printStackTrace()	                    Выводит трассировку стека исключений
 * -void printStackTrace(PrintStream stream)	Выводит трассировку стека исключений в указанный поток
 * -void printStackTrace(PrintWriter stream)	Направляет трассировку стека исключений в указанный поток
 * -String toString()	Возвращает объект типа String, содержащий полное описание исключения. Этот метод вызывается из метода println() при выводе объекта типа Throwable
 * <p>
 * Среди методов, определенных в классе Throwable, наибольший интерес представляют методы printStackTrace() и toString().
 * С помощью метода printStackTrace() можно вывести стандартное сообщение об ошибке и запись последовательности вызовов методов, которые привели к возникновению исключения,
 * А метод toString() позволяет получить стандартное сообщение об ошибке. Этот метод также вызывается в том случае, когда объект исключения передается в качестве параметра методу println(). Применение этих методов демонстрируется в следующем примере программы:
 */

// Применение методов из класса Throwable.
class ExcTest2 {
    static void genException() {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        // сгенерировать исключение в связи с попыткой обращения за границы массива
        nums[7] = 10;
        System.out.println("this won't be displayed");
    }
}

class UseThrowableMethods {
    public static void main(String args[]) {

        try {
            ExcTest2.genException();
        } catch (ArrayIndexOutOfBoundsException exc) { // перехватить исключение

            System.out.println("Standard message is: ");
            /*А метод toString() позволяет получить стандартное сообщение об ошибке. Этот метод также вызывается в том случае, когда объект исключения передается в качестве параметра методу println()*/
            System.out.println(exc);


            System.out.println("\nStack trace: ");
            /*С помощью метода printStackTrace() можно вывести стандартное сообщение об ошибке и запись последовательности вызовов методов, которые привели к возникновению исключения*/
            exc.printStackTrace();
        }
        System.out.println("After catch statement.");
    }
}


/*Вывод при дебаге:

Before exception is generated.
Standard message is:
java.lang.ArrayIndexOutOfBoundsException: 7

Stack trace:
java.lang.ArrayIndexOutOfBoundsException: 7
	at com.ExcTest2.genException(UseThrowableMethods.java:26)
	at com.UseThrowableMethods.main(UseThrowableMethods.java:35)
After catch statement.
Disconnected from the target VM, address: '127.0.0.1:49351', transport: 'socket'

Process finished with exit code 0
*/