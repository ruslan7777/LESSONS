package qpack;

/**
 * Created by RUSLAN77 on  13.12.2016 in Ukraine
 */ /*Этот код реализует динамическую, или "растущую", очередь, т.е. такую очередь, размеры которой увеличиваются, когда в ней не хватает места для символов.
* В данной реализации при попытке поместить в заполненную очередь еще один элемент создается новый массив, размеры которого в два раза превышают размеры исходного, текущее содержимое очереди копируется в новый массив, а ссылка на него помещается в переменную q.*/
// Динамическая очередь.
public class DynQueue implements ICharQ {
    private char q[];   // Массив для хранения элементов очереди,
    private int putloc, getloc; // Индексы размещения и извлечения
    // элементов очереди.
    // создать пустую очередь заданного размера
    public DynQueue(int size) {
        q = new char[size+1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    // поместить символ в очередь
    public void put(char ch) {
        if(putloc==q.length-1) {
        // увеличить размер очереди
        char t[] = new char[q.length * 2];

        // скопировать элементы в новую очередь
        for(int i=0; i < q.length; i++)
            t[i] = q[i];

        q = t;
        }

        putloc++;
        q[putloc] = ch;
    }
    // извлечь символ из очереди '
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}
