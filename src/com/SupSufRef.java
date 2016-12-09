package com;

/**
 * Created by RUSLAN77 on  01.12.2016 in Ukraine
 * Вообще говоря, ссылочная переменная может указывать только на объекты своего типа. Однако существует одно важное исключение из этоrо: ссылочной
 * переменной суперкласса может быть присвоена ссылка на объект любого подкласса, производного от данного суперкласса. Таким образом, ссылку на объект
 * суперкласса можно использовать для обращения к объектам соответствующих подклассов. Ниже приведен соответствующий пример.
 */
//Обращение к объекту подкласса по ссылочной переменной суперкласса
class X2 {
    int a;

    X2(int i) {
        a = i;
    }
}

class Y2 extends X2 {
    int b;

    Y2(int i, int j) {
        super(j);
        b = i;
    }
}

public class SupSufRef {
    public static void main(String[] args) {
        X2 x = new X2(10);
        X2 t2;
        Y2 y = new Y2(5, 6);

        t2 = x; // Допустимо, так как обе переменные одного типа

/*Класс Y является подклассом Х,поэтому переменные t2  и у могут ссылаться на один н тот же объект производного класса*/
        t2 = y; // По-прежнему допустимо по указанной вьппе причине

        System.out.println("x2.a: " + t2.a);

        // В классе Х известны только члены класса Х
        t2.a = 19;  // допустимо
        // t2.b = 27; // ошибка, так как переменная b не является членом класса Х
    }
}
/*В данном примере класс Y является подклассом X. Следовательно, переменной х2 можно присвоить ссылку на объект типа Y.
Следует особо подчеркнуть, что доступ к конкретным членам класса определяется типом ссылочной переменной, а не типом объекта, на который она ссылается. Это
означает, что если ссылка на объект подкласса присваивается ссылочной переменной суперкласса, то последняя может быть использована для доступа только к тем частям
данного объекта, которые определяются суперклассом. Именно поэтому переменной х2 недоступен член класса Y, когда она ссылается на объект этого класса. И в
 этом есть своя логика, поскольку суперклассу ничего не известно о тех членах, которые добавлены в его подкласс. Именно поэтому последняя строка кода в
 приведенном выше примере была закомментирована.*/