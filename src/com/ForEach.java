package com;

/**
 * Created by RUSLAN77 on  18.10.2016 in Ukraine  // Использование разновидности for-each цикла for
 */
public class ForEach {
    public static void main(String[] args) {
        int nums []={1,2,3,4,5,6,7,8,9,10};
        int sum=0;

        for (int x: nums) {
            System.out.print( " value=" + x+" ");
            sum+=x;
            if(x == 5) break; // прервать цикл по достижении значения 5
        }
        System.out.println("sum="+ sum);
    }
}
