package com;
/**
 * Created by RUSLAN77 on 16.07.2016.
 */
// Subtraction of integer powers of 2
class Power {
    public static void main(String args[]) {
//        int e;
//        int result;
//        for (int i = 0; i < 10; i++) {
//            result = 1;
//            e = i;
//
//            while (e > 0) {
//                result *= 2;
//                e--;
//            }
//
//            System.out.println("in 2 degree " + i + " equal " + result);
//        }
//    }
//}

        int rez = 1;
        for (int a = 0; a < 9; a++) {     // ��� ������� ��� While (�� ��� 2 � ������� 0 ����� 1)
            rez *= 2;
            System.out.println(rez);
        }
    }
}