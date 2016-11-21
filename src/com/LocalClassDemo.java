package com;

/**
 * Как уже упоминалось, класс можно вложить в области действия блока. В итоге получается локальный класс, недоступный за пределами блока.
 В данном примере класс ShowBits недоступен за пределами метода main () , а следовательно, попытка получить доступ к нему из любого метода, кроме main () ,
 приведет к ошибке.

 И последнее замечание: внутренний класс может быть безымянным. Экземпляр безымянного, или анонимного, внутреннего класса создается при объявлении класса с
 помощью оператора new. Безымянные внутренние классы будут подробнее рассмотрены в главе 16.
 */
public class LocalClassDemo {
    public static void main(String[] args) {
        //Внутренняя версия класса ShowBits
        class ShowBits {    //Локальный класс, вложенный в метод
            int numbits;

            ShowBits(int n) {
                numbits = n;
            }

            void show(long val) {
                long mask = 1;

                // Сдвиг влево для установки единицы в нужной позиции
                mask <<= numbits - 1;
                int spacer = 0;
                for (; mask != 0; mask >>= 1) {
                    if ((val & mask) != 0) System.out.print("l");
                    else System.out.print("0");
                    spacer++;
                    if ((spacer % 8) == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }
        for (byte b = 0; b < 10; b++) {
            ShowBits byteval = new ShowBits(8);
            System.out.print(b + " в двоичном представлении: ");
            byteval.show(b);
        }
    }
}