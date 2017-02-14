package com;
// TODO:
//07.02.2017 lessons

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by RUSLAN77 on  04.02.2017 in Ukraine
 */

class Hotel {
    //добавьте модификаторы видимости (private)
    private String cust[] = new String[3];
    private int i;

    public void addName(int index, String name) {
        i = index;
        cust[i] = name;
    }

    // метод, возвращающий все имена
    public String[] returnNames() {
        return cust;
    }

    public String getName(int i) {
        return cust[i];
    }

    //метод который удаляет пользователя из отеля по имени
    public void deleteName(String name) {
        for (int i = 0; i < cust.length; i++) {
            if (Objects.equals(name, cust[i])) {                   //Было  if (name == cust[i]) {
                cust[i] = null;
            }
        }
    }

    public void freeRooms() {
        for (int i = 0; i < cust.length; i++) {
            if (cust[i] == null) {
                System.out.println(i + " free;");
                System.out.println();}

        }
    }
}

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        hotel.addName(0, "Oksana");
        hotel.addName(1, "Dima");
        hotel.addName(2, "Andrew");

        //вызов метода,который удаляет пользователя из отеля по имени
        hotel.deleteName("Dima");

        //вызов метода, который будет проверять, есть ли свободные номера
        hotel.freeRooms();

        for (int m = 0; m < 3; m++) {
            System.out.println(hotel.getName(m));
        }
        System.out.println();

        // метод, который вернет все имена в виде стринга через запятую (вариант 1)
        System.out.print(Arrays.toString(hotel.returnNames())); // это нам подсказала Idea. Мы это ещё не изучали.

        //метод, который вернет все имена в виде стринга через запятую (вариант 2)
//        for (String t : hotel.returnNames()) {
//            System.out.print(t+", ");
//        }
//
    }
}

/*  1) cust - имя неудачное
2) В методе deleteName как только находишь нужній элемент и удаляешь, можно сразу выходить из цикла фор
3) public String[] returnNames()  - этот метод должен возвращать String
а не массив стрингов
или же это обычный гетер получается для массива и должен называться getCust()


ну. пока что можете создать Класс Customer
и добавить ему одно поле name
и заменить везде, чтоб вместо трингов сохранялись объекты его
хотя
это ж массив комнат
или кастомеров...
все-таки кастомеров)
вобщем, замените на этот класс. неважно, чего это массив)
и попробуйте в следующий раз создайте пулреквест
тогда комментарии мы сможем оставлять в нем прямо  в коде


почитайте коллекции. потом надо будет менять на коллекции*/