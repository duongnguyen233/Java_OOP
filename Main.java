public class Main {
    public static void main(String[] args) {
        BookArrayList bookList = new BookArrayList();
        bookList.printAllBooks();

        NameComparator nameCompare = new NameComparator();
        PriceComparator priceCompare = new PriceComparator();

        System.out.print("Sorting sciencefiction list based on names\n");
        nameCompare.compare(bookList.scienceList);
        System.out.print("\n");
        System.out.print("Sorting comedy list based on names\n");
        nameCompare.compare(bookList.comedyList);
        System.out.print("\n");
        System.out.print("Sorting thriller list based on names\n");
        nameCompare.compare(bookList.thrillerList);
        System.out.print("\n");

        System.out.print("Sorting sciencefiction list based on prices\n");
        priceCompare.compare(bookList.scienceList);
        System.out.print("\n");
        System.out.print("Sorting comedy list based on prices\n");
        priceCompare.compare(bookList.comedyList);
        System.out.print("\n");
        System.out.print("Sorting thriller list based on prices\n");
        priceCompare.compare(bookList.thrillerList);
        System.out.print("\n");
    }
}
