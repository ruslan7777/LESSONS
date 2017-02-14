package com;

/**
 * Created by RUSLAN77 on  08.02.2017 in Ukraine
 */
// Пример использования аннотации @Deprecated.

// Пометить класс как не рекомендованный к применению.
@Deprecated
class MyClass7 {
    private String msg;

    MyClass7(String m) {
        msg = m;
    }

    // Пометить метод в классе как не рекомендованный к применению.
    @Deprecated
    String getMsg() {
        return msg;
    }

    // ...
}

class AnnoDemo {
    public static void main(String args[]) {
        MyClass7 myObj = new MyClass7("test");

        System.out.println(myObj.getMsg());
    }
}