package com;

/**
 * Created by RUSLAN77 on  05.11.2016 in Ukraine
 */
public class NoZeroDiv {
    public static void main(String[] args) {
        int result;

        for (int i=-5; i<6; i++){
            //Предотвращается деление на нуль  Prevents division by zero
            result=i!=0?100/i:0;
            if (i!=0) System.out.println("i="+ i+" "+ " 100/" + "equal " +result);
        }
    }
}
