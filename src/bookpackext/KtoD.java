package bookpackext;

/**
 * Created by RUSLAN77 on  12.01.2017 in Ukraine
 * Применение класса FileWriter
 * Класс FileWriter представляет поток, через который можно осуществлять запись данных в файл. Ниже приведены общие формы объявления двух наиболее часто употребляемых конструкторов данного класса.
 * <p>
 * FileWriter(String имя_файла) throws IOException
 * FileWriter(String имя_файла, boolean append) throws IOException
 * Здесь имя файла обозначает полный путь к файлу. Если параметр append принимает логическое значение true, данные записываются в конец файла, а иначе они перезаписывают прежние данные на том же месте в файле. При возникновении ошибки в каждом из указанных выше конструкторов генерируется исключение IOException. Класс FileWriter является производным от классов OutputStreamWriter и Writer. Следовательно, в нем доступны методы, объявленные в его суперклассах.
 * <p>
 * Ниже приведен краткий пример программы, демонстрирующий ввод текстовых строк с клавиатуры и последующий их вывод в файл test. txt. Набираемый текст читается до тех пор, пока пользователь не введет слово "stop". Для вывода текстовых строк в файл используется класс FileWriter.
 */
// Простой пример утилиты ввода с клавиатуры и вывода данных на диск, демонстрирующий применение класса FileWriter.

import java.io.*;

class KtoD {
    public static void main(String args[]) {
        String str;

        //создать объект типа BufferedReader, связанный с потоком System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text ('stop' to quit).");

        // Создание потока вывода типа FileWriter.
        try (FileWriter fw = new FileWriter("test.txt", false)) {
            do {
                System.out.print(": ");
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n"; // add newline

                // Запись текстовых строк в файл,
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
