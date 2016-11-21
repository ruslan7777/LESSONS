package com;

/**
 Иногда для подготовки к созданию объектов в классе должны быть выполнены некоторые инициализирующие действия. В частности, может возникнуть потребность установить
 соединение с удаленным сетевым узлом или задать значения некоторых статических переменных перед тем, как воспользоваться статическими методами класса. Для
 решения подобных задач в Java предусмотрены статические блоки. Статический блок выполняется при первой загрузке класса, еще до того, как класс будет использован
 для каких-нибудь других целей.
 */

class StaticBlock {
    static double root0f2;
    static double root0f3;


    static {           //Этот блок выnолняется nри загрузке класса
        System.out.println("Bнyтpи статического блока");
        root0f2 = Math.sqrt(2.0);
        root0f3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }
}

public class SDemo3 {
    public static void main(String args[]) {
        StaticBlock оЬ = new StaticBlock("Bнyтpи конструктора");
        System.out.println("Kopeнь квадратный из 2 равен " +
                StaticBlock.root0f2);
        System.out.println("Kopeнь квадратный из 3 равен " +
                StaticBlock.root0f3);
    }
}//Как видите, статический блок выполняется еще до того, как будет создан какой-либо объект.