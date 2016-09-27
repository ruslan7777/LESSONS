package com;

/**
 * Created by RUSLAN77 on  27.09.2016 in Ukraine
 */

//Простой пример применения параметра в методе
    //A simple example of the use of a parameter in the method

    class ChkNum{
    //вернуть логическое значение true, если х содержит четное число
    //return a Boolean value true, if x contains an even number
    boolean isEven(int x){
        if ((x%2)==0) return true;
        else return false;
    }
}

public class ParmDemo {
    public static void main(String[] args) {
        ChkNum e=new ChkNum();
        if (e.isEven(10)) System.out.println("10-четное число even number ");
        if (e.isEven(9)) System.out.println("9-четное число even number ");
        if (e.isEven(8)) System.out.println("8-четное число even number ");
    }
}
