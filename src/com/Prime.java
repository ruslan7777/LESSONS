package com;

class Prime {
    public static void main(String[] args) {
        int i, j;
        boolean isprime;

        for (i = 2; i <=100; i++) {
            isprime = true;
            {
                for (j = 2; j < i; j++)
                    if ((i % j) == 0) isprime = false;
                if (isprime)
                    System.out.println(i + " - простое число.");
            }
        }
    }
}
//    Первым циклом мы выбираем i-е число.
//        Во вложенном цикле пытаемся делить i-e число на j-e нацело, и если у нас это получается, то значит число не простое и булевой переменной isprime меняем
// значение на false.
//        Последним if-ом просто тупо проверяем - прошло ли это число проверку на простые числа, и если прошло успешно, то выводим его в консоль...
