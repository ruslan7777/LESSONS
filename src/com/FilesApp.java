package com;

/**
 * Created by RUSLAN77 on  11.01.2017 in Ukraine
 * Это не Шилдт. Пример с http://metanit.com/java/tutorial/6.3.php
 */
import java.io.*;
public class FilesApp {

    public static void main(String[] args) {

        try(FileInputStream fin=new FileInputStream("C://LESSONS//note.txt"))
        {
            System.out.println("Размер файла: " + fin.available() + " байт(а)");

            int i=-1;
            while((i=fin.read())!=-1){

                System.out.print((char)i);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}