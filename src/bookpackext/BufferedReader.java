package bookpackext;

/**
 * Created by RUSLAN77 on  12.01.2017 in Ukraine
 * <p>
 * Для ввода символьной строки с клавиатуры следует воспользоваться методом readLine() из класса Buf feredReader. Ниже приведена общая форма объявления этого метода.
 * <p>
 * String readLine() throws IOException
 * Этот метод возвращает объект типа String, содержащий прочитанные символы. При попытке прочитать символьную строку по окончании потока метод возвращает пустое знчение null.
 * <p>
 * Ниже приведен пример программы, демонстрирующий применение класса BufferedReader и метода readLine(). В этой программе текстовые строки читаются и отображаются до тех пор, пока не будет введено слово "stop".
 */

// Чтение символьных строк с консоли средствами класса BufferedReader.

import java.io.*;

class ReadLines {
    public static void main(String args[]) throws IOException {

        // создать объект типа BufferedReader, связанный с потоком System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        do {
            // использовать метод readLine() из класса BufferedReader
            // для чтения текстовой строки
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
