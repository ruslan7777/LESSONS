package com;

/**
 * Created by RUSLAN77 on   23.09.2016 in Ukraine in Ukraine
 */

// Добавление метода range() в класс Vehicle               //Adding a method of range () in the Vehicle class
public class Vehicle {
    int passengers, fuelcap, mpg;
    int range(){
        return mpg*fuelcap;
    } //Возврат дальности поездки дпя заданного тронспортного средства
}
class AddMeth{
    public static void main(String[] args) {
        Vehicle minivan=new Vehicle();
        Vehicle sportcar=new Vehicle();

        // Присвоить значения полям в объекте minivan              // Assign values to the fields in the object minivan
        minivan.passengers=7;
        minivan.fuelcap=16;
        minivan.mpg=21;

        // Присвоить значения полям в объекте sportscar              // Assign values to the fields in the object sportscar
        sportcar.passengers=2;
        sportcar.fuelcap=14;
        sportcar.mpg=12;


        System.out.println("Mini van can carry "+ minivan.passengers + " a distance " + minivan.range()+ " miles ");
        System.out.print("Sport car can carry " +sportcar.passengers+ " a distance " + sportcar.range() + " passengers ");
            }
}
// Обращение к переменным экземпляра fuelcap и mpg осуществляется в методе без использования точечной
//нотации (строка 9). То есть если в методе используется переменная экземпляра, определенная в его классе,
//обращаться к ней можно напрямую, не указывая объект.
