public class Book {
    String name;
    String author = "Abhinav";
    double price = 29.99;
    boolean sold = false;

    public void sell() {
        sold = true;
    }
    public void rename(String newName){
        name = newName;
    }
    public void printAll() {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Sold: " + sold);
    }
}
