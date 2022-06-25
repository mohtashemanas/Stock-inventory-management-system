import java.util.Scanner;

public class Main {
    static String InventoryName = null; //object inv is created to access Inventoryclass
    static Inventory inv = new Inventory();
    static Scanner in = new Scanner(System.in);
    static boolean works = true;


    public static void main(String[] args) {   //Main method- also prompts the user to enter username and password
        Scanner input = new Scanner(System.in);


        while (works) {
            String user;
            String Password;
            System.out.println("Enter your Username:");
            user = input.nextLine();

            System.out.println("Enter your Password:");
            Password = input.nextLine();


            if (user.equals("Username") && Password.equals("Password")) {

                System.out.println("Welcome user");

                System.out.println("Please Select an Appropiate option,Thankyou\n");

            } else {
                System.out.println("Incorrect Password OR UserName");
                break;
            }

            System.out.println("(1) Press 1 for showing the inventory");
            System.out.println("(2) Press 2 for adding stock and bill details");
            System.out.println("(3) Press 3 to Quit the Program");
            System.out.println("(4) Press 4 for checking stock availability");


            int UserAnswer = in.nextInt();
            switch (UserAnswer) {

                case 1:
                    System.out.println(inv.toString());
                    break;

                case 2:
                    addStock();
                    break;


                case 3:
                    ToQuit();
                    break;

                case 4:
                    StockAvailable();
            }
        }
    }

    private static void ToQuit() { //Quits the loop

        works = false;
        System.out.println(("Thank you for using our Program, please comeback Again!."));
    }

    private static void addStock() {
        String name;
        int stockid;
        int quantity;

        int orderid;
        String orderplace;

        int customerbills;
        String suppliername;

        String date;


        System.out.println("\nEnter name");
        name = in.next();
        System.out.println("\nEnter quantity");
        quantity = in.nextInt();
        System.out.println("\nEnter stockid");
        stockid = in.nextInt();

        System.out.println("\nEnter orderid");
        orderid = in.nextInt();
        System.out.println("\nEnter orderplace");
        orderplace = in.next();

        System.out.println("\nEnter customerbills");
        customerbills = in.nextInt();
        System.out.println("\nEnter suppliername");
        suppliername = in.next();

        System.out.println("\nEnter date");
        date = in.next();

        Stock b = new Stock(stockid, name, quantity, orderid, orderplace, customerbills, suppliername, date);
        inv.addStock(b);

    }

    private static void StockAvailable() {
        Scanner input = new Scanner(System.in);

        System.out.println("Below are the Stock Available");

        System.out.println("-------------------------------------------------------------------------");

        System.out.println("#########################################################################");
        System.out.println("#StockID                           :112233:\t \t \t\t\t\t \t\t#");
        System.out.println("#Item                              :Bracelet:\t \t\t\t\t \t\t#");
        System.out.println("#Availability                      :Yes:\t \t \t\t\t \t\t\t#");
        System.out.println("#Price-(Currency)                  :2000($DOLLARS):\t\t \t\t\t\t#");
        System.out.println("#Color-(Orange,Golden,White,Black) :White And Golden:\t \t\t\t\t#");
        System.out.println("#Quantity                          :120 Qty:\t \t\t\t\t\t\t#");
        System.out.println("#########################################################################\n");

        System.out.println("-------------------------------------------------------------------------");



        System.out.println("#########################################################################");
        System.out.println("#StockID                           :113344:\t \t \t\t\t\t \t\t#");
        System.out.println("#Item                              :KeyBoard:\t \t\t\t\t \t\t#");
        System.out.println("#Availability                      :Yes:\t \t \t\t\t \t\t\t#");
        System.out.println("#Price-(Currency)                  :1500($DOLLARS):\t\t \t\t\t\t#");
        System.out.println("#Color-(Green,Chroma,Red)          :White And Golden:\t\t \t\t\t#");
        System.out.println("#Quantity                          :1000 Qty:\t \t\t\t\t\t\t#");
        System.out.println("#########################################################################\n");

        System.out.println("-------------------------------------------------------------------------");


        System.out.println("#########################################################################");
        System.out.println("#StockID                  :114455:\t \t\t\t\t\t \t \t\t \t#");
        System.out.println("#Item                     :Lipsticks:\t \t \t\t \t\t\t\t  \t#");
        System.out.println("#Availability             :Yes:\t \t \t \t\t\t\t\t\t \t\t#");
        System.out.println("#Price-(Currency)         :25($DOLLARS):\t \t\t\t \t \t\t\t#");
        System.out.println("#Color-(Red,Purple,Green) :Green:\t \t\t\t\t \t \t\t\t\t#");
        System.out.println("#Quantity                 :120 Qty\t \t\t\t\t\t\t\t\t\t#");
        System.out.println("#########################################################################\n");

        System.out.println("-------------------------------------------------------------------------");

        System.out.println("#########################################################################");
        System.out.println("#StockID                  :115566:\t \t\t\t\t\t \t \t\t \t#");
        System.out.println("#Item                     :Iphone:\t \t \t\t\t \t\t\t\t  \t#");
        System.out.println("#Availability             :No:\t \t \t \t\t\t\t\t\t \t\t#");
        System.out.println("#Price-(Currency)         :1500($DOLLARS):\t \t\t\t \t \t\t\t#");
        System.out.println("#Color-(Black,Golden,Red) :Null:\t \t\t\t\t \t \t\t\t\t#");
        System.out.println("#Quantity                 :"  + "Qty\t \t\t\t\t\t\t\t\t\t#");
        System.out.println("#########################################################################\n");

        System.out.println("-------------------------------------------------------------------------");





        System.out.println("Please login again\n"); //prints and tells the user to relogin again.

    }

    {
    }
}










