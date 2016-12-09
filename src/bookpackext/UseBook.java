// Использование ключевого слова import

package bookpackext;

// Импорт пакета bookpack.
import bookpack.*;

// использовать класс Book из пакета bookpack
class UseBook {
    public static void main(String args[]) {
        // Теперь к членам класса Book можно обращаться непосредственно, не указывая полностью определенное имя.
        Book books[] = new Book[5];

        books[0] = new Book("Java: A Beginner's Guide",
                "Schildt", 2007);
        books[1] = new Book("Java: The Complete Reference",
                "Schildt", 2007);
        books[2] = new Book("The Art of Java",
                "Schildt and Holmes", 2003);
        books[3] = new Book("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new Book("On the Road",
                "Kerouac", 1955);

        for (Book book : books) book.show();//БЫЛО for(int i=0; i < books.length; i++) books[i].show();
    }
}

/*До использования оператора import было так
* lass UseBook {
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
*/