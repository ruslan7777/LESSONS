package com;

/**
 * Created by RUSLAN77 on  22.11.2016 in Ukraine
 */

// Отображение символов строки в обратном порядке с помощью рекурсии
//class backward {
//    String str;
//
//    backward    (String s) {
//        str = s;
//    }
//
//    void backw(int idx) {
//        if (idx != str.length() - 1) backw(idx + 1);
//        System.out.print(str.charAt(idx));
//
//    }
//}
//
//
//class page_244 {
//    public static void main(String[] args) {
//        backward s = new backward("ABC");
//        s.backw(0);
//    }
//}


/*Помимо очереди, в программах часто используется структура данных, которая называется стеком. Обращение к стеку осуществляется по принципу "первым
пришел - последним обслужен". Стек можно сравнить со стопкой тарелок, стоящих на столе. Последней берется тарелка, поставленная на стол первой. Создайте
класс Stack, реализующий стек для хранения символов. Используйте методы push () и рор () для манипулирования содержимым стека. Пользователь класса
Stack должен иметь возможность задавать размер стека при его создании. Все члены класса Stack, кроме методов push () и рор (), должны быть объявлены
как pri vate. (Подсказка: в качестве исходной заготовки можете воспользоваться классом Queue, изменив в нем лишь способ доступа к данным.)*/
// Класс, реализующий стек для хранения символов
//class Stack {
//    private char stck[]; // массив для хранения элементов стека
//    private int tos; // вершина стека
//
//    // Создать пустой стек заданного размера
//    Stack(int size) {
//        stck = new char[size]; // выделить память для стека
//        tos = 0;
//    }
//// Создать один стек из другого стека
//        Stack(Stack ob) {
//            tos = ob.tos;
//            stck = new char[ob.stck.length];
//// скопировать элементы
//            for (int i = 0; i < tos; i++)
//                stck[i] = ob.stck[i];
//        }
//        // Создать стек с начальными значениями
//        Stack( char a[]){
//            stck = new char[a.length];
//            for (int i = 0; i < a.length; i++) {
//                push(a[i]);
//            }
//        }
//
//
//        // Поместить символы в стек
//
//    void push(char ch) {
//        if (tos == stck.length){
//            System.out.println(" -- Стек заполнен");
//        return;
//    }
//    stck[tos]= ch;
//    tos++;
//}
//    // Извлечь символы из стека
//    char pop() {
//        if (tos == 0) {
//            System.out.println(" -- Стек пуст");
//            return (char) 0;
//        }
//        tos--;
//        return stck[tos];
//    }
//}
//
//// Демонстрация использования класса Stack
//class page_244 {
//    public static void main(String args[]) {
//// создать пустой стек на 10 элементов
//        Stack stk1 = new Stack(10);
//        char name[] = {'Т', 'о', 'm'};
//// создать стек из массива
//        Stack stk2 = new Stack(name);
//        char ch;
//        int i;
//// поместить символы в стек stkl
//        for (i = 0; i < 10; i++)
//            stk1.push((char) ('A' + i));
//// создать один стек из другого стека
//        Stack stk3 = new Stack(stk1);
//// отобразить стеки
//        System.out.print("Coдepжимoe stkl: ");
//        for (i = 0; i < 10; i++) {
//            ch = stk1.pop();
//            System.out.print(ch);
//        }
//        System.out.println("\n");
//        System.out.print("Coдepжимoe stk2: ");
//        for (i = 0; i < 3; i++) {
//            ch = stk2.pop();
//            System.out.print(ch);
//        }
//        System.out.println("\n");
//        System.out.print("Coдepжимoe stkЗ: ");
//        for (i = 0; i < 10; i++) {
//            ch = stk3.pop();
//            System.out.print(ch);
//        }
//    }
//}


//Предположим, имеется следующий класс.
//       class Test{
//        int а;
//        Test(int i) { а = i; }
//         }

//        Напишите метод swap () , реализующий обмен содержимым между двумя объектами
//        типа Test, на которые ссылаются две переменные данного типа.

//        void swap(Test оb1, Test оb2) {           /*todo
//                                                  У конструктора Test же один параметр (int i) а не два!!!*/
//        int t;
//        t = оb1.а;
//        оb1.а= оb2.а;
//        оЬ2.а = t;



/*Создайте метод sum () , принимающий список аргументов переменной длины и предназначенный для суммирования передаваемых ему значений типа int. Метод
должен возвращать результат суммирования. Продемонстрируйте работу этого метода.*/
class Sumit {
    int sum(int... n) {
        int result = 0;
        for (int aN : n) result += aN;    // БЫЛО      for (int i = 0; i < n.length; i++)     result += n[i];
        return result;
    }
}

class page_244 {
    public static void main(String args[]) {
        Sumit siObj = new Sumit();

        int total = siObj.sum(1, 2, 3);
        System.out.println("Cyммa: " + total);

        total = siObj.sum(1, 2, 3, 4, 5);
        System.out.println("Cyммa: " + total);
    }
}

/*Приведите пример вызова переrруженноrо метода с переменным количеством аргументов,демонстрирующий возникновение неоднозначности.
Ниже приведен один из вариантов переrружаемоrо метода с переменным числом аргументов, при вызове которого проявляется неоднозначность.
douЫe myMeth(douЫe ... v ) { // ...
douЫe myMeth(douЫe d, douЫe ... v) { // ...
Если попытаться вызвать метод myМeth ( ) с одним аргументом следующим образом: myMeth(l.1); то компилятор не сможет определить, какой именно метод вызывается.*/