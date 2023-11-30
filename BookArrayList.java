import java.util.ArrayList;

public class BookArrayList {
    ArrayList<Book> scienceList = new ArrayList<Book>();
    ArrayList<Book> comedyList = new ArrayList<Book>();
    ArrayList<Book> thrillerList = new ArrayList<Book>();

    BookArrayList() {
        scienceList.add(new Book("Brief History of Time", "Stephen Hawking", 43, "sciencefiction"));
        scienceList.add(new Book("The Unidentified", "Colin Dickey", 53, "science fiction"));
        comedyList.add(new Book("Scoop", "Evelyn Waugh", 45, "comedy"));
        comedyList.add(new Book("My Lifely", "Paddy McGuinness", 29, "comedy"));
        thrillerList.add(new Book("Wild Place", "Christian White", 47, "comedy"));
        thrillerList.add(new Book("The Guest List", "Lucy Foley", 23, "comedy"));
    }

    void printAllBooks(){
        for (int i = 0; i < scienceList.size(); i++) {
            scienceList.get(i).print_book();
        }
        System.out.print("\n");
        for (int i = 0; i < comedyList.size(); i++) {
            comedyList.get(i).print_book();
        }
        System.out.print("\n");
        for (int i = 0; i < thrillerList.size(); i++) {
            thrillerList.get(i).print_book();
        }
        System.out.print("\n");
    }
}
