package com;

/**
 * Created by RUSLAN77 on  07.10.2016 in Ukraine
 */
class Vehicle7 {
    int passengers, fuelcap, mpg;

    //Конструктор класса Vehicle   The class constructor Vehicle
    Vehicle7(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    //Determine the range of travel of the vehicle    Определить дальность поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    //Calculate the amount of fuel needed transport     a means for overcoming the given distance
    //Рассчитать объем топлива, необходимого транспортному    средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

public class VehConsDemo {
    public static void main(String[] args) {

        // Полностью сконструировать объекты транспортных средств  Fully construct objects of vehicles
        Vehicle7 minivan = new Vehicle7(7, 16, 21);
        Vehicle7 sportcar = new Vehicle7(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons=minivan.fuelneeded(dist);
        System.out.println("Для преодоления "+ " " + dist+ " миль мини-фургону требуется " + gallons+  " галлонов топлива");

        gallons=sportcar.fuelneeded(dist);
        System.out.println("Для преодоления "+ " " + dist+ " миль спортивному автомобилю требуется " + gallons+  " галлонов топлива");
    }
}
/**При создании объекты minivan и sportscar инициализируются конструктором Vehicle (). Каждый такой объект инициализируется параметрами, указанными в конструкторе
его класса. Например, в строке кода Vehicle minivan = new Vehicle(7, 16, 21); значения 7, 16 и 21 передаются конструктору Vehicle () при создании нового объекта
mini van с помощью оператора new. В итоге копии переменных passengers, fuelcap и mpg в объекте minivan будут содержать значения 7, 16 и 21 соответственно.*/
