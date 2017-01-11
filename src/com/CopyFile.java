package com;

/**
 * Created by RUSLAN77 on  11.01.2017 in Ukraine
 */

/* Копирование текстового файла. При вызове этой программы следует указать имя исходного и целевого файлов. Например, для копирования файла FIRST.TXT в файл SECOND.TXT в командной строке нужно указать следующее: java CopyFile FIRST.TXT SECOND.TXT  */

import java.io.*;

class CopyFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin;
        FileOutputStream fout;

// Прежде всего следует убедиться, что оба файла были указаны,
//        if (args.length != 2) {
//            System.out.println("Usage: CopyFile From To");
//            return;
//        }

// открыть исходный файл
        try {
            fin = new FileInputStream("C://LESSONS//out//production//LESSONS//com//TEST11.txt");
            //todo
            // НЕ РАБОТАЛА ПРОГРАММА!!!!!! Путь в скобках добавлял сам вместо args[0]

        } catch (FileNotFoundException exc) {
            System.out.println("Input File Not Found");
            return;
        }

// открыть целевой файл
        try {
            fout = new FileOutputStream("C://LESSONS//out//production//LESSONS//com//TEST22.txt");
            //todo
            // НЕ РАБОТАЛА ПРОГРАММА!!!!!! Путь в скобках добавлял сам вместо args[1]

        } catch (FileNotFoundException exc) {
            System.out.println("Error Opening Output File");
            // закрыть исходный файл
            try {
                fin.close();
            } catch (IOException exc2) {
                System.out.println("Error closing input file.");
            }
            return;
        }
// копировать файл

        try {
            do {
                // Чтение байтов из одного файла и запись их в другой файл.
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("File Error");
        }
        try {
            fin.close();
        } catch (IOException exc) {
            System.out.println("Error closing input file.");
        }
        try {
            fout.close();
        } catch (IOException exc) {
            System.out.println("Error closing output file.");
        }
    }
}


