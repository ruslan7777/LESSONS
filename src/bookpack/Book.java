
/*В рассмотренном выше примере классы Book и BookDemo находились в одном и том же пакете, поэтому при организации доступа из класса BookDemo к классу Book не возникало никаких затруднений. По умолчанию все члены класса имеют право обращаться к членам других классов из того же самого пакета. Если бы класс Book находился
в одном пакете, а класс BookDemo - в другом, ситуация оказалась бы немного сложнее. В этом случае доступ к классу Book по умолчанию был бы запрещен. Для того чтобы
сделать класс Book доступным для других пакетов, в код программы нужно внести три изменения.
Во-первых, сам класс Book должен быть объявлен открытым (puЫic).
Это позволит обращаться к нему за пределами пакета bookpack.
Во-вторых, конструктор класса должен быть также объявлен открытым.
И наконец, модификатор доступа puЬlic следует указать также перед методом show ().
 Благодаря этому конструктор и метод show () станут доступными за пределами пакета bookpack. Следовательно, для
использования класса Book в классах, принадлежаших другим пакетам, его следует объявить так, как показано ниже.*/

// Класс Book,видоизмененный для открытого доступа,Класс Book и некоторые его члены должны быть объявлены открытыми,чтобы ими можно было пользоваться в других пакетах.

//public class Book {        //Класс Book и ero чnеиы доnжны быть объявлены открытыми,  чтобы их можно было нсnоnьзовать в друrих nакетах
//    private String title;
//    private String author;
//    private int pubDate;
//
//    // Теперь конструктор объявлен открытым,
//    public Book(String t, String a, int d) {
//        title = t;
//        author = a;
//        pubDate = d;
//    }
//
//    // Теперь метод объявлен открытым,
//    public void show()  {
//        System.out.println(title) ;
//        System.out.println(author);
//        System.out.println(pubDate);
//        System.out.println() ;
//    }
//}

    /*Для того чтобы воспользоваться классом Book в другом пакете, нужно применить оператор import, который будет рассматриваться в следующем разделе, либо указать полностью определенное имя класса, т.е. предварять имя класса именем пакета. Ниже приведен пример класса UseBook, содержащегося в пакете bookpackext. Для обращения к классу Book в нем используется полностью определенное имя этого класса.

// Этот класс принадлежит пакету bookpackext.
        package bookpackext;
// использовать класс Book из пакета bookpack.

class UseBook {
    public static void main(String args[])  {

        bookpack.Book books[] = new bookpack.Book[5];    // Перед именем класса Book указывается имя пакета bookpack.
        books[0] = new bookpack.Book("Java: A Beginner's Guide",// Перед именем класса Book указывается имя пакета bookpack.
                "Schildt", 2011);
        books[1] = new bookpack.Book("Java: The Complete Reference",// Перед именем класса Book указывается имя пакета bookpack.
                "Schildt", 20011);
        books[2] = new bookpack.Book("The Art of Java",// Перед именем класса Book указывается имя пакета bookpack.
                "Schildt and Holmes", 2003);
        books[3] = new bookpack.Book("Red Storm Rising",// Перед именем класса Book указывается имя пакета bookpack.
                "Clancy", 1986);
        books[4] = new bookpack.Book("On the Road",// Перед именем класса Book указывается имя пакета bookpack.
                "Kerouac", 1955);

        for(int i=0; i < books.length; i++) books[i].show();
    }
}
    Обратите внимание на то, что при каждом обращении к классу Book перед ним указывается имя пакета bookpack. Если бы здесь не использовалось полностью определенное имя, то при компиляции класса UseBook класс Book не был бы найден.*/

// Объявление защищенными переменных экземпляра в классе Book,
package bookpack;

public class Book {
    // При объявлении этих переменных использован модификатор доступа protected.
    protected String title;
    protected String author;
    protected int pubDate;

    public Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
    }
}



