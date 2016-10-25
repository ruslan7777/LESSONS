package com;

/**
 * Created by RUSLAN77 on  25.10.2016 in Ukraine
 */
class StringDemo {
    public static void main(String args[]) {
// Различные способы объявления строк
        String strl = new String("B Java строки - объекты.");
        String str2 = "Их можно создавать разными способами.";
        String strЗ = new String(str2);
        System.out.println(strl);
        System.out.println(str2);
        System.out.println(strЗ);
    }
}