public class BookAction {
    public static void main(String[] args) {
        Book book = new Book();
        book.printAll();
        book.sell();
        book.rename("Hello World!");
        System.out.println("-----------------------");
        book.printAll();
    }
}
