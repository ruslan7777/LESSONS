package com;

/**
 * Created by RUSLAN77 on  15.11.2016 in Ukraine         Простые типы данных передаются методам по значению
 */
class Test{
    /*это метод не может изменить значеия аргументов, передаваемых ему при вызове*/
    void noChange (int i, int j){
        i=i+j;
        j=-j;
    }
}
public class CallByValue {
    public static void main(String[] args) {
        Test ob=new Test();
        int a=15, b=20;
        System.out.println(" a and b before call " + a +" "+b);

        ob.noChange(a,b);
        System.out.println(" a and b after call " + a +" "+b);

        /*Как видите, действия, выполняемые в теле метода noChange () , никоим образом не влияют на значения переменных а и Ь в вызывающем методе.*/
    }
}
