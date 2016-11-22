package com;

/**
 * Created by RUSLAN77 on  22.11.2016 in Ukraine
 */

// Отображение символов строки в обратном порядке с помощью рекурсии
class backward {
    String str;

    backward    (String s) {
        str = s;
    }

    void backw(int idx) {
        if (idx != str.length() - 1) backw(idx + 1);
        System.out.print(str.charAt(idx));

    }
}


class page_244 {
    public static void main(String[] args) {
        backward s = new backward("This is а test");
        s.backw(0);
    }
}
