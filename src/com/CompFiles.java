package com;

/**
 * Created by RUSLAN77 on  11.01.2017 in Ukraine
 */
 /*
  Для того чтобы воспользоваться этой программой, укажите  имена сравниваемых файлов в командной строке, например:
  java CompFile FIRST.TXT SECOND.TXT.  Для компиляции этого кода требуется JDK 7  или более поздняя версия данного комплекта.
  */
import java.io.*;
class CompFiles {
    public static void main(String args[])
    {
        int i=0, j=0;

        // Прежде всего следует убедиться, что файлы были указаны,
//        if(args.length !=2 )    {
//            System.out.println("Usage: CompFiles fl f2");
//            return;
//        }

        // сравнить файлы
        try (FileInputStream f1 = new FileInputStream("C://LESSONS//out//production//LESSONS//com//TEST11.txt");
             FileInputStream f2 = new FileInputStream("C://LESSONS//out//production//LESSONS//com//TEST22.txt"))
        {
            // проверить содержимое каждого файла
            do {
                i = f1.read();
                j = f2.read();
                if(i != j) break;
            }   while (i != -1 && j != -1) ;

            if(i != j)
                System.out.println("Files differ.");
            else
                System.out.println("Files are the same.");
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
