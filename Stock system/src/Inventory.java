import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Inventory { private List<Stock> all;



    public Inventory() {
        all = new ArrayList<Stock>(); //list all stock
        String[] arrayValues = new String[all.size()];

        arrayValues = all.toArray(arrayValues); //converts array list to array
        System.out.println(Arrays.toString(arrayValues));
    }


    public void addStock(Stock stock) {
        all.add(stock);
    }


    public String toString() {  //Stores the stock
        String total = "\n";
        for (int i = 0; i < all.size(); i++) {
            Stock r = all.get(i);
            total = total + r.toString();
        }
        return total;
    }
}

