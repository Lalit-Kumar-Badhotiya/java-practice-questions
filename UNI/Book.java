public class Book {
    String title;
    String author;
    int price;

    Book() {
        title = "no name";
        author = "no author";
        price = 0;
    }

    Book(String bookname, String writer, int money) {
        title = bookname;
        author = writer;
        price = money;
    }
}

class Run {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("rich dad poor dad", "robert kiosaki", 500);
        System.out.println(book1.author);
        System.out.println(book1.price);
        System.out.println(book1.title);
        System.out.println(book2.author);
        System.out.println(book2.price);
        System.out.println(book2.title);
    }

}
