package com;

import java.io.*;

/**
 * Created by RUSLAN77 on  12.01.2017 in Ukraine
 */
class Help11 {
    String helpfile; // Имя файла со справочной информацией

    /*Имя файла со справочной информацией передается конструктору класса Help и запоминается в переменной экземпляра helpfile. А поскольку каждый экземпляр класса
        Help11 содержит отдельную копию переменной helpfile, то каждый из них может взаимодействовать с отдельным файлом. Это дает возможность создавать отельные наборы   справочных файлов на разные темы.*/
    Help11(String fname) {
        helpfile = fname;
    }

    /*Добавьте в класс Help метод helpon(), код которого приведен ниже. Этот метод извлекает справочную информацию по заданной теме.*/

    // отобразить справочную информацию по заданной теме
    boolean helpon(String what) {
        int ch;
        String topic, info;

        // открыть справочный файл
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
            do {
                // читать символы до тех пор, пока не встретится знак #
                ch = helpRdr.read();

                // а теперь проверить, совпадают ли темы
                if (ch == '#') {
                    topic = helpRdr.readLine();
                    if (what.compareTo(topic) == 0) { // found topic
                        do {
                            info = helpRdr.readLine();
                            if (info != null) System.out.println(info);
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        } catch (IOException exc) {
            System.out.println("Error accessing help file.");
            return false;
        }
        return false; // тема не найдена
    }
    /*Прежде всего обратите внимание на то, что в методе helpon() обрабатываются все исключения, связанные с вводом-выводом, поэтому в заголовке метода не указано ключевое слово throws. Благодаря такому подходу упрощается разработка методов, в которых используется метод helpon(). В вызывающем методе достаточно обратиться к методу helpon(), не заключая его вызов в блок try/catch.
Для открытия файла со справочной информацией служит класс FileReader, оболочкой которого является класс Buf feredReader. В справочном файле содержится текст, и поэтому справочную систему удобнее локализовать через символьные потоки ввода-вывода.
Метод helpon (\ действует следующим образом. Символьная строка, содержащая название темы, передается этому методу в качестве параметра. Метод открывает сначала файл со справочной информацией. Затем в файле производится поиск, т.е. проверяется совпадение содержимого переменной what и названия темы. Напомним, что в файле заголовок темы предваряется символом #, поэтому метод сначала ищет данный символ. Если символ найден, производится сравнение следующего за ним названия темы с содержимым переменной what. Если сравниваемые строки совпадают, то отображается справочная информация по данной теме. И если заголовок темы найден, то метод helpon() возвращает логическое значение true, иначе — логическое значение false.*/


    /*В классе Help содержится также метод getSelectionO, который предлагает задать тему и возвращает строку, введенную пользователем.*/

    // получить тему
    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter topic: ");

        try {
            topic = br.readLine();
        } catch (IOException exc) {
            System.out.println("Error reading console.");
        }
        return topic;
    }
}
/*В теле этого метода сначала создается объект типа BufferedReader, который связывается с потоком вывода System.in. Затем в нем запрашивается название темы, которое принимается и далее возвращается вызывающей части программы.*/


// продемонстрировать справочную систему, находящуюся на диске
class FileHelp {
    public static void main(String args[]) {
        Help11 hlpobj = new Help11("C://LESSONS//helpfile.txt");
        String topic;

        System.out.println("Try the help system. " + "Enter ’stop' to end.");
        do {
            topic = hlpobj.getSelection();
//            if (topic.compareTo("stop")) != 0; попробовать добавить условие пораньше
            if (!hlpobj.helpon(topic))
                System.out.println("Topic not found.\n");

        } while (topic.compareTo("stop") != 0);
    }
}