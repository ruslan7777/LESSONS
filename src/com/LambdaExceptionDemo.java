package com;

/**
 * Created by RUSLAN77
 * Поскольку вызов метода read ( ) может сопровождаться генерацией исключения
 * IOException, оно должно быть указано в операторе throws метода ioAction () функционального
 * интерфейса MyIOAction. Без этого программа не будет скомпилирована ввиду
 * несовместимости лямбда-выражения с методом ioAction (). Чтобы это проверить,
 * удалите оператор throws и попытайтесь скомпилировать программу. Вы увидите, что
 * компилятор выведет сообщение об ошибке.
 */

import java.io.*;

interface MyIOAction {
    boolean ioAction(Reader rdr)throws IOException ;
}

public class LambdaExceptionDemo {
    public static void main(String[] args) {
        double[] values = {1.0, 2.0, 3.0, 4.0};

        //Данное блочное лямбда-выражение может генерировать исключение IOException. Следовательно, это исключение
// должно быть указано в операторе throws метода ioAction() функционального интерфейса MyIOAction.
        MyIOAction myIO = (rdr) -> {   //данное лямбда-вырожение может rенерировать исключение
            int ch = rdr.read(); //может rенерировать исключение IOException
            return true;
        };
    }
}