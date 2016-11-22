package com;

/* Демонстрация использования метода с переменным числом аргументов.
 В приведенной  программе обращает на себя внимание следующее. Во-первых, как пояснялось выше, обращение к параметру v в методе vaTest () осуществляется как
 к массиву. Дело в том, что он действительно является массивом (и, таким образом, может иметь переменную длину) Многоточие в объявлении этого метода
 указывает компилятору на использование переменного числа аргументов, а также на необходимость поместить
 их в массив v. Во-вторых, в методе main () присутствуют вызовы метода vaTest () с использованием различного числа аргументов, в том числе и без указания аргумента.
 Указываемые аргументы автоматически помещаются в массив v. Если же аргументы не указаны, длина этого массива будет равна нулю.
 */
public class VarArgs {

    // Метод vaTest() допускает переменное число аргументов
    static void vaTest(int... v) {
        System.out.println("Koличecтвo аргументов: " + v.length);
        System.out.println("Coдepжимoe: ");

        for (int i = 0; i < v.length; i++)
            System.out.println(" arg  " + i + " - " + v[i]);

        System.out.println();
    }

    public static void main(String[] args) {
        {
            // Метод vaTest () может вызываться с переменным числом аргументов
            vaTest(10);       // 1 аргумент
            vaTest(1, 2, 3);    // 3 аргумента
            vaTest();         //без аргументов
        }
    }
}

