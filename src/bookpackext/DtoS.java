package bookpackext;

/*Применение класса FileReader
        В классе FileReader создается объект типа Reader, который можно использовать для чтения содержимого файла. Чаще всего употребляется такой конструктор этого класса:
        FileReader(String имя_файла) throws FileNotFoundException
        где имя файла обозначает полный путь к файлу. Если указанный файл не существует, генерируется исключение FileNotFoundException.
        Класс FileReader является производным от классов InputStreamReader и Reader. Следовательно, в нем доступны методы, объявленные в его суперклассах.

        Приведенный ниже пример демонстрирует простую утилиту для отображения на экране содержимого текстового файла test. txt. Она является своего рода дополнением к утилите, рассмотренной в предыдущем разделе.*/

// Простая утилита ввода с дйска и вывода на экран, демонстрирующая применение класса FileReader.

import java.io.*;

class DtoS {
    public static void main(String args[]) {
        String s;
        // Создание в классе BufferedReader оболочки с целью заключить в нее класс FileReader и организовать чтение данных из файла.
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
   /* Обратите внимание на то, что для потока типа FileReader создана оболочка в классе BufferedReader. Благодаря этому появляется возможность обращаться к методу readLine(). Кроме того, закрытие потока типа Buf feredReader, на который в данном примере ссылается переменная br, автоматически приводит к закрытию файла.*/