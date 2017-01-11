package com;

/**
 * Created by RUSLAN77 on  11.01.2017 in Ukraine
 * В приведенных до сих пор примерах программ читались и записывались байтовые значения, содержащие символы в коде ASCII. Но аналогичным образом можно также организовать чтение и запись любых типов данных. Допустим, требуется создать файл, содержащий значения типа int, double или short. Для чтения и записи простых типов данных в Java предусмотрены классы DatalnputStream и DataOutputStream.
 * <p>
 * Класс DataOutputStream реализует интерфейс DataOutput, в котором определены методы, позволяющие записывать в файл значения любых простых типов. Следует, однако, иметь в виду, что данные записываются во внутреннем двоичном формате, а не в виде последовательности символов. Методы, наиболее часто применяемые для записи простых типов данных в Java, приведены в табл. 10.5. Каждый из них генерирует исключение IOException при возникновении ошибки ввода-вывода.
 * <p>
 * Таблица 10.5. Наиболее часто употребляемые методы вывода данных, определенные в классе DataOutputStream
 * <p>
 * Метод вывода данных	Описание
 * void writeBoolean (boolean val)	Записывает логическое значение, определяемое параметром val
 * void writeByte (int,val)	Записывает младший байт целочисленного значения, определяемого параметром val
 * void writeChar (int,val)	Записывает значение, определяемое параметром val, интерпретируя его как символ
 * void writeDouble (double val)	Записывает значение типа double, определяемое параметром val
 * void writeFloat (float val)	Записывает значение типа float, определяемое параметром val
 * void writelnt(int val)	Записывает значение типа int, определяемое параметром val
 * void writeLong (long val)	Записывает значение типа long, определяемое параметром val
 * void writeShort (int val)	Записывает целочисленное значение, определяемое параметром val, преобразуя его в тип short
 * <p>
 * <p>
 * Ниже приведен конструктор класса DataOutputStream. Обратите внимание на то, что при вызове ему передается экземпляр класса OutputStream.
 * DataOutputStream(OutputStream outputStream)
 * где outputStream — это поток вывода, в который записываются данные. Для того чтобы организовать запись данных в файл, следует передать конструктору в качестве параметра outputStream объект типа FileOutputStream.
 * <p>
 * <p>
 * Класс DatalnputStream реализует интерфейс DataInput, в котором объявлены методы для чтения всех простых типов данных в Java (табл. 10.6). В каждом из этих методов может быть сгенерировано исключение IOException при возникновении ошибки ввода-вывода. В качестве своего основания класс DataInputStream использует экземпляр класса InputStream, перекрывая его методами для чтения различных типов данных в Java. Однако в потоке типа DatalnputStream данные читаются в двоичном виде, а не в удобной для чтения форме.
 * Ниже приведен конструктор класса DatalnputStream.
 * DataInputStream(InputStream inputStream)
 * где inputStream — это поток, связанный с создаваемым экземпляром класса DatalnputStream. Для того чтобы организовать чтение данных из файла, следует передать конструктору в качестве параметра inputStream объект типа FilelnputStream.
 * <p>
 * Таблица 10.6. Наиболее часто употребляемые методы ввода данных, определенные в классе DatalnputStream
 * <p>
 * Метод ввода данных	Описание
 * boolean readBoolean()	Читает значение типа boolean
 * byte readByte()	Читает значение типа byte
 * char readChar()	Читает значение типа char
 * double readDouble()	Читает значение типа double
 * float readFloat()	Читает значение типа float
 * int readlnt()	Читает значение типа int
 * long readLong()	Читает значение типа long
 * short readShort()	Читает значение типа short
 * Ниже приведен пример программы, демонстрирующий применение классов DataOutputStream и DatalnputStream. В этой программе данные разных типов сначала записываются в файл, а затем читаются из файла.
 */
// Запись и чтение двоичных данных.Для компиляции этого кода требуется JDK 7 или более поздняя версия данного комплекта.

import java.io.*;

class RWData {
    public static void main(String args[]) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        // записать ряд значений
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata.txt"))) {
            // Запись двоичных данных в файл testdata.
            System.out.println("Writing " + i);
            dataOut.writeInt(i);

            System.out.println("Writing " + d);
            dataOut.writeDouble(d);

            System.out.println("Writing " + b);
            dataOut.writeBoolean(b);

            System.out.println("Writing " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
        } catch (IOException exc) {
            System.out.println("Write error.");
            return;
        }

        System.out.println();

        // а теперь прочитать записанные значения
        try (DataInputStream dataln = new DataInputStream(new FileInputStream("testdata.txt"))) {
            // Чтение двоичных данных из файла testdata.
            i = dataln.readInt();
            System.out.println("Reading " + i);

            d = dataln.readDouble();
            System.out.println("Reading " + d);

            b = dataln.readBoolean();
            System.out.println("Reading " + b);

            d = dataln.readDouble();
            System.out.println("Reading " + d);
        } catch (IOException exc) {
            System.out.println("Read error.");
        }
    }
}