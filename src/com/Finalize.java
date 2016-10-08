package com;
/**
 * Created by RUSLAN77 on  08.10.2016 in Ukraine
 */
//Демонстрация сборки мусора и метода finalize()
class FDemo{
    int x;
    FDemo(int i){
        x=i;
    }

    // Вызывается при удалении объекта
    protected void finalize() throws Throwable {

        System.out.println("Финализация "+  x);
        {
            super.finalize();
        }
    }

    //Генерирует объект, который тотчас уничтожается
    void generator(int i){
        FDemo o=new FDemo(i);
    }
}

public class Finalize {
    public static void main(String[] args) {
        int count;
        FDemo ob=new FDemo(0);

        /* Генерируется большое количество объектов.В какой-то момент времени должна начаться сборка мусора.Примечание: возможно, для того чтобы активизировать
          систему сборки мусора, количество генерируемых объектов придется увеличить. */
        for (count=1; count<1000000; count++)
            ob.generator(count);
        }
}
/*Для страховки в методе finalize можно проверять были ли освобождены занимаемые ресурсы.
При переопределении метода finalize, необходимо вызвать реализацию суперкласса. Если этого не сделать, то finalize суперкласса никогда не будет вызван.
protected void finalize() throws Throwable {
   try {
      // Освобождаем необходимые ресурсы
   } finally {
      super.finalize();
   }
   */