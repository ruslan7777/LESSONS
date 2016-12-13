package com;

/**
 * Created by RUSLAN77 on  13.12.2016 in Ukraine
 */
/*Для того чтобы определить набор общедоступных констант, достаточно создать интерфейс, в котором объявлялись бы не методы, а только нужные константы. Каждый класс, которому требуются эти константы, должен просто “реализовать” интерфейс, чтобы сделать константы доступными. Ниже приведен несложный пример, демонстрирующий такой подход.*/

// Интерфейс, содержащий только константы,
interface IConst {
    // Константы
    int MIN = 0;
    int MAX = 10;
    String ERRORMSG = "Boundary Error";
}

class IGonstD implements IConst {
    public static void main(String args[]) {
        int nums[] = new int[MAX];

        for (int i = MIN; i < 11; i++) {
            if (i >= MAX) System.out.println(ERRORMSG);
            else {
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }
        }
    }
}