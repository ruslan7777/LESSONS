package com;

/**
 * Created by RUSLAN77 on  14.02.2017 in Ukraine
 *
 * Использование метасимвольных аргументов

 Несмотря на всю полезность типовой безопасности в обобщениях, иногда она может помешать использованию идеально подходящих языковых конструкций. Допустим, требуется реализовать метод absEqual(), возвращающий логическое значение true в том случае, если два объекта рассмотренного выше класса NumericFns содержат одинаковые абсолютные значения. Допустим также, что этот метод должен оперировать любыми типами числовых данных, которые могут храниться в сравниваемых объектах. Так, если один объект содержит значение 1,25 типа Double, а другой — значение -1,25 типа Float, метод absEqual() должен возвращать логическое значение true. Один из способов реализации метода absEqual() состоит в том, чтобы передавать этому методу параметр типа NumericFns, а затем сравнивать его абсолютное значение с абсолютным значением текущего объекта и возвращать логическое значение true, если эти значения совпадают. Например, вызов метода absEqual() может выглядеть следующим образом:

 NumericFns<Double> dOb = new NumericFns<Double>(1.25) ;
 NumericFns<Float> fOb = new NumericFns<Float>(-1.25) ;

 if(dOb.absEqual(fOb))
 System.out.println("Absolute values are the same.");
 else
 System.out.println("Absolute values differ.");
 На первый взгляд может показаться, что при выполнении метода absEqual() не должно возникнуть никаких затруднений, но это совсем не так. Затруднения начнутся при первой же попытке объявить параметр типа NumericFns. Каким он должен быть? Казалось бы, подходящим должно быть следующее решение, где т указывается в качестве параметра типа:

 //Не пройдет!

 // определить равенство абсолютных значений в двух объектах
 boolean absEqual(NumericFns<T> ob) {
 if(Math.abs(num.doubleValue()) ==
 Math.abs(ob.num.doubleValue()) return true;
 return false;
 }
 В данном случае для определения абсолютного значения каждого числа используется стандартный метод Math. abs(). Полученные значения сравниваются. Но дело в том, что рассматриваемое здесь решение окажется пригодным лишь в том случае, если объект класса NumericFns, передаваемый в качестве параметра, имеет тот же тип, что и текущий объект. Так, если текущий объект относится к типу NumericFns, параметр ob также должен быть типа NumericFns, а следовательно, сравнить текущий объект с объектом типа NumericFns не удастся. Таким образом, выбранное решение не является обобщенным.

 Для того чтобы создать обобщенный метод absEqual(), придется воспользоваться еще одним свойством обобщений в Java, называемым метасимвольным аргументом. Для указания такого аргумента служит знак ?, обозначающий неизвестный тип данных. Используя метасимвольный аргумент, можно переписать метод absEqual() следующим образом:

 // определить равенство абсолютных значений в двух объектах
 boolean absEqual(NumericFns<?> ob) { // обратите внимание на метасимвол
 if(Math.abs(num.doubleValue()) ==
 Math.abs(ob.num.doubleValue()) return true;
 return false;
 }
 В данном случае выражение NumericFns<?> соответствует любому типу объекта из класса NumericFns и позволяет сравнивать абсолютные значения в двух произвольных объектах класса NumericFns. Ниже приведен пример программы, демонстрирующий применение метасимвольного аргумента.
 */
// Применение метасимвольного аргумента
class NumericFns2<T extends Number> {
    T num;

    // передать конструктору ссылку на числовой объект
    NumericFns2(T п) {
        num = п;
    }

    // возвратить обратную величину
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // возвратить дробную часть
    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // определить равенство абсолютных значений в двух объектах
    boolean absEqual(NumericFns2<?> ob) {
        return Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue());

        // выше было if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) return true;
       //             return false;
    }
   }

// продемонстрировать применение метасимвольного аргумента
class WildcardDemo {
    public static void main(String args[]) {
        NumericFns2<Integer> iOb = new NumericFns2<Integer>(6);
        NumericFns2<Double> dOb = new NumericFns2<Double>(-6.0);
        NumericFns2<Long> lob = new NumericFns2<Long>(5L);

        System.out.println("Testing iOb and dOb.");

        // В этом вызове метода тип метасимвольного аргумента совпадает с типом Double.
        if (iOb.absEqual(dOb))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");

        System.out.println();

        System.out.println("Testing iOb and 10b.");

        // А в этом вызове метода тип метасимвольного аргумента совпадает с типом Long.
        if (iOb.absEqual(lob))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");
    }
}
