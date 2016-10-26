package com;

/**
 * Created by RUSLAN77 on  26.10.2016 in Ukraine
 */
// Применение метода substring()
class SubStr {
    public static void main(String args[]) {
        String orgstr = ".Java - двигатель Интернета.";

// Сформировать подстроку
        String substr = orgstr.substring(7, 25);  //Здесь создается новая строка,   содержащая нужную подстроку
        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}