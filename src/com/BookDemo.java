package com;

/**
 * Created by RUSLAN77 on  09.12.2016 in Ukraine
 */
// Простая программа, демонстрирующая применение пакета.
// Этот файл является частью пакета bookpack.

// Класс Book принадлежит пакету com.
class Book {
    private String title;
    private String author;
    private int pubDate;

    Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

// Класс BookDemo также принадлежит пакету com.
class BookDemo {
    public static void main(String args[])  {
        Book books[] = new Book[5];

        books[0] = new Book("Java: A Beginner's Guide",
                "Schildt", 2011);
        books[1] = new Book("Java: The Complete Reference",
                "Schildt", 2011);
        books[2] = new Book("The Art of Java",
                "Schildt and Holmes", 2003);
        books[3] = new Book("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new Book("On the Road",
                "Kerouac", 1955);
        for (Book book : books) book.show(); //БЫЛО for(int i=0; i < books.length; i++) books[i].show();
    }
}

/*ПАКЕТ НЕ ПЕРЕИМЕНОВЫВАЛ!!! ОСТАВИЛ COM

Присвойте файлу с приведенным выше исходным кодом имя BookDemo. j ava и поместите его в каталог bookpack.
Скомпилируйте этот исходный файл из каталога, находящегося непосредственно над каталогом bookpack, указав в командной строке следующее:
javac bookpack/BookDemo.java
После этого попробуйте выполнить скомпилированную программу, указав в командной строке следующее:

java bookpack.BookDemo
Не забывайте, что для нормального выполнения указанных выше команд текущим должен быть каталог, являющийся родительским по отношению к каталогу bookpack. (Для компиляции и запуска программы из какого-нибудь другого каталога вам придется указать путь к каталогу bookpack, используя один из двух других описанных выше способов обращения к каталогам с пакетами.)

Теперь классы BookDemo и Book принадлежат пакету bookpack. Это означает, что при вызове интерпретатора нельзя ограничиваться передачей ему только имени класса BookDemo. Приведенная ниже команда не будет выполнена, java BookDemo

Перед именем класса BookDemo следует непременно указать имя его пакета, как показано выше.*/
