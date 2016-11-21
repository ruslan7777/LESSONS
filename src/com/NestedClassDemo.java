package com;

/*
 Иногда внутренний класс используется для предоставления ряда услуг внешнему классу, в котором он содержится. Ниже приведен пример применения внутреннего класса
 для вычисления различных значений, которые используются включающим его классом.

 В данном примере внутренний класс Inner обрабатывает массив nums, являющийся членом класса Outer. Вложенный класс имеет доступ к членам объемлющего класса,
и поэтому он может непосредственно обращаться к массиву nums.
А вот обратное не справедливо. Так, например, метод analyze () не может непосредственно вызвать метод
min () , не создав объект типа Inner.
 */


// Применение внутреннего класса
class Outer {
    int nums[];
    int b = 100;

    Outer(int n[]) {
        nums = n;
    }

    void Analyze() {
        Inner inOb = new Inner(); //  inOb получает из внешнего класса и массив и переменную?!?! // TODO: 21.11.2016
        System.out.println("Минимyм: " + inOb.min());
        System.out.println("Maкcимyм: " + inOb.max());
        System.out.println("Cpeднee: " + inOb.avg());
    }

    // Внутренний класс
    class Inner {   //Внутренний класс
        int min() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] < m) m = nums[i];
            return m;
        }

        int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] > m) m = nums[i];
            return m;
        }

        int avg() {
            int а = 0;
            for (int num : nums) а += num;      // Было  for (int i = 0; i < nums.length; i++)   а += nums[i];
            return а / nums.length;
        }
    }
}

class NestedClassDemo {
    public static void main(String args[]) {
        int x[] = {3, 2, 1, 5, 6, 9, 7, 8};
        Outer outOb = new Outer(x);
        outOb.Analyze();
    }
}