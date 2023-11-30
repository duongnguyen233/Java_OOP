public class Book {
    public String name;
    public String author;
    public float price;
    public String type;

    Book(String name, String author, float price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    void set_values(String name, String author, float price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    void print_book(){
        System.out.print("Name: " + this.name + "\t Author: " + this.author + "\t Price: " + this.price + "\t Type: " + this.type + "\n");
    }
}
