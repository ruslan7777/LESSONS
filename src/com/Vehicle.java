package com;

/**
 * Created by RUSLAN77 on   23.09.2016 in Ukraine in Ukraine
 */

// Добавление метода range() в класс Vehicle               //Adding a method of range () in the Vehicle class
public class Vehicle {
    int passengers, fuelcap, mpg;
    void range(){
        System.out.println("Distanse- "+ fuelcap*mpg+ " miles");
    }
}
class AddMeth{
    public static void main(String[] args) {
        Vehicle minivan=new Vehicle();
        Vehicle sportcar=new Vehicle();

        int range1,range2;
// Присвоить значения полям в объекте minivan              // Assign values to the fields in the object minivan
        minivan.passengers=2;
        minivan.fuelcap=16;
        minivan.mpg=21;

        // Присвоить значения полям в объекте sportscar              // Assign values to the fields in the object sportscar
        sportcar.passengers=2;
        sportcar.fuelcap=14;
        sportcar.mpg=12;

        System.out.print("Mini van can carry " + minivan.passengers+ " passengers ");
        minivan.range();// display trip distance mini-van

        System.out.print("Sport car can carry " + sportcar.passengers+ " passengers ");
        sportcar.range();// display trip distance mini-van
    }
}
// Обращение к переменным экземпляра fuelcap и mpg осуществляется в методе без использования точечной
//нотации (строка 9). То есть если в методе используется переменная экземпляра, определенная в его классе,
//обращаться к ней можно напрямую, не указывая объект.
