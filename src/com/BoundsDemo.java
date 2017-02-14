package com;

/**
 * Created by RUSLAN77 on  14.02.2017 in Ukraine
 * Ограниченные типы
 */
//В этой версии класса NumericFns аргументом типа, заменяющим параметр типа Т, должен стать класс Number или производный от него подкласс, как показано ниже,
class NumericFns<T extends Number> {
    T num;

    // передать конструктору ссылку на числовой объект
    NumericFns(T n) {
        num = n;
    }

    // возвратить обратную величину
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // возвратить дробную часть
    double fraction() {
        return num.doubleValue() - num.intValue();
    }
}

// продемонстрировать класс NumericFns
class BoundsDemo {
    public static void main(String args[]) {

        // Применение класса Integer вполне допустимо, так как он является подклассом, производным от класса Number.
        NumericFns<Integer> iOb = new NumericFns<Integer>(5);

        System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
        System.out.println("Fractional component of iOb is " + iOb.fraction());

        System.out.println();

        // Применение класса Double также допустимо.
        NumericFns<Double> dOb = new NumericFns<Double>(5.25);

        System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
        System.out.println("Fractional component of dOb is " + dOb.fraction());

        // Следующая строка кода не будет компилироваться, так как класс String не является производным от класса Number.
//         NumericFns<String> strOb = new NumericFns<String>("Error");
    }
}
/*Как видите, для объявления класса NumericFns в данном примере служит следующая строка кода:

class NumericFns<T extends Number> {
Теперь тип т ограничен классом Number, а следовательно, компилятору Java известно, что для всех объектов типа т доступен метод doubleValue(), а также другие методы, определенные в классе Number. И хотя это само по себе дает немалые преимущества, кроме того, предотвращает создание объектов класса NumericFns для нечисловых типов. Так, если попытаться удалить комментарии из строки кода в конце рассматриваемой здесь программы, а затем повторно скомпилировать ее, то будет получено сообщение об ошибке, поскольку класс String не является подклассом, производным от класса Number.*/