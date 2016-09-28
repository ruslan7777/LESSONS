package com;

/**
 * Created by RUSLAN77 on   23.09.2016 in Ukraine in Ukraine
 */

//Добавление параметризированного метода, в котором производится расчет объема топлива, необходимого транспортному средству для
 //  преодоления заданного расстояния.
    //Adding a parameterized method, which is carried out calculation of the amount of fuel required for the vehicle
    //  overcoming a given distance.


// Добавление метода range() в класс Vehicle               //Adding a method of range () in the Vehicle class
class Vehicle {
    int passengers, fuelcap, mpg;
    //Рассчитать объем топлива, необходимого транспортному средству для преодоления заданного расстояния
//Calculate the amount of fuel needed for the vehicle to overcome a given distance
double fuelneeded(int miles){
    return (double) miles/mpg;
}
}

class CompFuel{
    public static void main(String[] args) {
        Vehicle minivan=new Vehicle();
        Vehicle sportcar=new Vehicle();
        double gallons;
        int dist=252;

                // Присвоить значения полям в объекте minivan              // Assign values to the fields in the object minivan
        minivan.passengers=7;
        minivan.fuelcap=16;
        minivan.mpg=21;

        // Присвоить значения полям в объекте sportscar              // Assign values to the fields in the object sportscar
        sportcar.passengers=2;
        sportcar.fuelcap=14;
        sportcar.mpg=12;

        gallons=minivan.fuelneeded(dist);
        System.out.println("Для преодоления " + dist +  " миль мини-фургону требуется " +    gallons + " галлонов топлива");

        gallons=sportcar.fuelneeded(dist);
        System.out.println("Для преодоления " + dist +  " миль спортивному автомобилю требуется " +    gallons + " галлонов топлива");
            }
}
// Обращение к переменным экземпляра fuelcap и mpg осуществляется в методе без использования точечной
//нотации (строка 9). То есть если в методе используется переменная экземпляра, определенная в его классе,
//обращаться к ней можно напрямую, не указывая объект.
