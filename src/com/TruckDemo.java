package com;

/**
 * Created by RUSLAN77 on  29.11.2016 in Ukraine
 */

//Расширение класса Vehicle для грузовиков
class Vehicle2 {
    private int passengers, fuelcap, mpg;//количество пассажиров,объем топливного бака,потребление топлива

    // Конструктор класса Vehicle
    Vehicle2(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Возвратить дальность поездки транспортного средства
//    int range() {
//        return mpg * fuelcap;
//    }

    // Вычислить объем топлива, требующегося для прохождения заданного пути
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Методы доступа к переменным экземпляра
//    int getPassengers() {
//        return passengers;
//    }
//
//    void setPassengers(int p) {
//        passengers = p;
//    }
//
//    int getFuelcap() {
//        return fuelcap;
//    }
//
//    void setFuelcap(int f) {
//        fuelcap = f;
//    }
//
//    int getMpg() {
//        return mpg;
//    }

//    void setMpg(int m) {
//        mpg = m;
//    }
}

// Расширение класса Vehicle для грузовиков
class Truck extends Vehicle2 {
    private int cargocap;//грузоподъемность в фунтах

    // Конструктор класса Truck
    Truck(int p, int f, int m, int c) {
        /* Инициализация членов класса Vehicle с использованием конструктора этого класса. */
        super(p, f, m);
        cargocap = c;
    }

    // Методы доступа к переменной cargocap
    int getCargo() {
        return cargocap;
    }

//    void setCargo(int c) {
//        cargocap = c;
//    }
}

public class TruckDemo {
    public static void main(String[] args) {
        // Создать ряд новых объектов типа Truck
        Truck semi = new Truck(2, 200, 7, 4000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Грузовик может перевезти " + semi.getCargo() + " фунтов");
        System.out.println("Для преодоления " + dist + " миль грузовику  требуется " + gallons + " галлонов топлива.\n");

        gallons = pickup.fuelneeded(dist);

        System.out.println("Пикaп может перевезти " + pickup.getCargo() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль пикапу требуется " + gallons + " галлонов топлива.");

    }

}



