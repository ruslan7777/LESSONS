package com;

/**
 * Created by RUSLAN77 on  15.11.2016 in Ukraine     Возврат объекта, определяемого разработчиком программы
 */
class Err {
    String msg; // сообщение об ошибке
    int severity; // уровень серьезности ошибки

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };
    int howbad[] = {3, 3, 2, 4};

    Err getErrorInfo(int i) {
        if (i >= 0 & i < msgs.length)
            return new Err(msgs[i], howbad[i]);
        else
            return new Err("Несуществующий код ошибки", 0);
    }
}

public class ErrInfo {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + " уровень: " + e.severity);
        e = err.getErrorInfo(19);
        System.out.println(e.msg + " уровень: " + e.severity);

    }
}
/*При каждом вызове метода getErrorinfo () создается новый объект типа Err, и ссылка на него возвращается вызывающему методу. Затем этот объект используется методом
main () для отображения уровня серьезности ошибки и текстового сообщения.Объект, возвращенный методом, существует до тех пор, пока на него имеется хотя бы
одна ссьmка. Если ссьmки на объект отсутствуют, он уничтожается сборщиком мусора.Поэтому при выполнении программы не может возникнуть ситуация, когда объект удаляется лишь потому, что метод, в котором он бьm создан, завершился.*/