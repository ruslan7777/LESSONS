package com;

/**
 * Created by RUSLAN77 on  27.09.2016 in Ukraine
 */

class Factor{
    boolean isFactor(int a, int b){
if ((b%a)==0) return true;
        else return false;
    }
}
public class IsFact {
    public static void main(String[] args) {
        Factor x=new Factor();
        if (x.isFactor(2,20)) System.out.println("2- divider делитель");
        if (x.isFactor(3,20)) System.out.println("this line will not be displayed, эта строка не будет выведена");

    }
}
