import java.util.ArrayList;
import java.util.Collections;

public class PriceComparator implements Comparator{
    @Override
    public void compare(ArrayList<Book> bookList) {
        int size = bookList.size();
        //logic for sorting
        for(int i = 0; i<size-1; i++)
        {
            for (int j = i+1; j<size; j++)
            {
                //compares each elements of the array to all the remaining elements
                if(bookList.get(i).price > bookList.get(j).price)
                {
                    //swapping array elements
                    Collections.swap(bookList, i, j);
                }
            }
        }
        for (int i = 0; i < bookList.size(); i++) {
            System.out.print(bookList.get(i).price + "\n");
        }
    }
}
