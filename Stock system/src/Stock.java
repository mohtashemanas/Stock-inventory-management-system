/**
 * Created by M00653683 on 28/02/2019.
 */
public class Stock {
    int stockid;
    String name;
    int quantity;
    int orderid;
    String orderplace;
    int customerbills;
    String suppliername;
    String date;



    public Stock() {  //Default constructor

        stockid = 0;
        name = null;
        quantity = 0 ;
        orderid=0;
        orderplace=null;
        customerbills=0;
        suppliername=null;
        date=null;

    }

    public Stock(int Stockid, String Name, int Quantity,int Orderid,String Orderplace,int Customerbills,
                 String Suppliername, String Date) { // Second constructor

        stockid = Stockid;
        name = Name;
        quantity = Quantity;
        orderid = Orderid;
        orderplace = Orderplace;
        customerbills = Customerbills;
        suppliername = Suppliername;
        date= Date;


    }


    public String toString() {

        return "\nStockid: " + stockid + "\nName: " + name + "\nQuantity: " + quantity + "\nOrderid: " + orderid
                + "\nOrderplace: " + orderplace + "\nCustomerbills: " + customerbills +"\n" +
                "SupplierName: " + suppliername+ "\nDate: " + date ;
    }

}


