import java.util.Scanner;

public class App {
    public static ArrayList Items = new ArrayList();
    public static LinkedList Cart = new LinkedList();
    public static boolean session = true;
    public static boolean sessionPM = true;
    public static boolean sessionCM = true;

    public static int findItemIndex(int id)
    {
        for(int i = 0; i < Items.size(); i++)
        {
            if(Items.get(i).ID == id) return i;
        }
        return -1;
    }

    public static int findCartItemIndex(int id)
    {
        for(int i = 0; i < Cart.size(); i++)
        {
            if(Cart.get(i).productID == id) return i;
        }
        return -1;
    }

    public static double totalPrice()
    {
        double sum = 0;
        for(int i = 0; i < Cart.size(); i++)
        {
            int indexItm = findItemIndex(Cart.get(i).productID);
            sum += Cart.get(i).QTY * Items.get(indexItm).Price;
        }

        return sum;
    }

    public static void ProductManagement()
    {
        Scanner inPM = new Scanner(System.in);
        String optPM;
        System.out.println("\n\n======== Product Management =======");
        System.out.println("========= List of Products ========\n");
        System.out.println("ID | Name | Description | Price | Stock");
        System.out.println(Items);
        System.out.println("\n=========== End of List ==========\n");
        System.out.println("=============== Menu =============\n");
        System.out.println("1: Add Product");
        System.out.println("2: Remove Product");
        System.out.println("3: Update Product\n");
        System.out.println("=== Enter other keys to return ===\n");
        System.out.print("Enter your option here: ");
        optPM = inPM.nextLine();
        
        switch(optPM)
        {
            case "1":
            System.out.println("\n\n======== Product Management =======");
            System.out.println("=========== Add Product ==========\n");
            String name;
            String des;
            double price;
            int qty;
            try
            {
                System.out.print("Enter product name: ");
                name = inPM.nextLine();
                System.out.print("Enter product description: ");
                des = inPM.nextLine();
                System.out.print("Enter product price: ");
                price = inPM.nextDouble();
                System.out.print("Enter product stocked quantity: ");
                qty = inPM.nextInt();

                Items.add(new ProductItem(name, des, price, qty));
            }
            catch (Exception e)
            {
                System.out.println("!! Invalid Entered Value !!");
            }
            break;

            case "2":
            System.out.println("\n\n======== Product Management =======");
            System.out.println("========= List of Products ========\n");
            System.out.println("ID | Name | Description | Price | Stock");
            System.out.println(Items);
            System.out.println("\n=========== End of List ==========\n");
            System.out.println("========== Remove Product =========\n");
            System.out.print("Enter ProductID you wish to remove here: ");
            try
            {
                int n = inPM.nextInt();
                if(findItemIndex(n) != -1) Items.remove(findItemIndex(n));

            }
            catch(Exception e)
            {
                System.out.println("!! Invalid Entered Value !!");
            }
            break;

            case "3":
            System.out.println("\n\n========== Update Product =========");
            System.out.println("========= List of Products ========\n");
            System.out.println("ID | Name | Description | Price | Stock");
            System.out.println(Items);
            System.out.println("\n=========== End of List ==========\n");
            System.out.println("========== Update Product =========\n");
            System.out.print("Enter ProductID you wish to update here: ");
            try
            {
                int n = inPM.nextInt();
                if(findItemIndex(n) == -1) System.out.println("!! No ProductID " + n + " In Record !!");
                else {
                    Scanner inUP = new Scanner(System.in);
                    int index = findItemIndex(n);
                    System.out.println("\n========= Selected Product ========\n");
                    System.out.println("ID | Name | Description | Price | Stock");
                    System.out.println(Items.get(index));
                    System.out.println("\n=============== Menu =============\n");
                    System.out.println("1: Update Price");
                    System.out.println("2: Update Stocked Quantity\n");
                    System.out.println("=== Enter other keys to return ===\n");
                    System.out.print("Enter your option here: ");
                    String optUP = inUP.nextLine();

                    switch(optUP)
                    {
                        case "1":
                        System.out.println("\n========= Selected Product ========\n");
                        System.out.println("ID | Name | Description | Price | Stock");
                        System.out.println(Items.get(index));
                        System.out.println("\n========== Update Price =========\n");
                        System.out.print("Enter updated price here: ");
                        try
                        {
                            double j = inUP.nextDouble();
                            Items.get(index).setPrice(j);
                        }
                        catch(Exception e)
                        {
                            System.out.println("!! Invalid Entered Value !!");
                        }
                        break;

                        case "2":
                        System.out.println("\n========= Selected Product ========\n");
                        System.out.println("ID | Name | Description | Price | Stock");
                        System.out.println(Items.get(index));
                        System.out.println("\n========== Update Stock =========\n");
                        System.out.print("Enter updated stock here: ");
                        try
                        {
                            int j = inUP.nextInt();
                            Items.get(index).setStock(j);
                        }
                        catch(Exception e)
                        {
                            System.out.println("!! Invalid Entered Value !!");
                        }
                        break;

                        default:
                        break;
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("!! Invalid Entered Value !!");
            }
            break;

            default:
            sessionPM = false;
            break;
        }
    }

    public static void CartManagement()
    {
        Scanner inCM = new Scanner(System.in);
        String optCM;
        System.out.println("\n\n========== Cart Management =========");
        System.out.println("========= Available Products ========\n");
        System.out.println("ID | Name | Description | Price | Stock");
        System.out.println(Items);
        System.out.println("\n=========== End of List ==========\n");
        System.out.println("============= Cart ============\n");
        System.out.println("ID | Quantity");
        System.out.println(Cart);
        System.out.println("\nTotal Price: THB " + totalPrice());
        System.out.println("\n=========== End of List ==========\n");
        System.out.println("=============== Menu =============\n");
        System.out.println("1: Add Product");
        System.out.println("2: Remove Product");
        System.out.println("3: Update Product Quantity");
        System.out.println("4: Checkout\n");
        System.out.println("=== Enter other keys to return ===\n");
        System.out.print("Enter your option here: ");
        optCM = inCM.nextLine();

        switch(optCM)
        {
            case "1":
            System.out.println("\n\n========== Cart Management =========");
            System.out.println("========= Available Products ========\n");
            System.out.println("ID | Name | Description | Price | Stock");
            System.out.println(Items);
            System.out.println("\n=========== End of List ==========\n");
            System.out.println("=========== Add Product ==========\n");
            int id;
            int qty;

            try
            {
                System.out.print("Enter ProductID you wish to buy here: ");
                id = inCM.nextInt();
                int indexItm = findItemIndex(id);
                int indexCrt = findCartItemIndex(id);
                if(indexItm == -1)
                {
                    System.out.println("!! No ProductID " + id + " In Record !!");
                    break;
                }
                System.out.print("Enter quantity you wish to buy here: ");
                qty = inCM.nextInt();
                if(Items.get(indexItm).StockQTY < qty || (indexCrt != -1 && Items.get(indexItm).StockQTY < qty + Cart.get(indexCrt).QTY))
                {
                    System.out.println("!! ProductID " + id + "\'s Stock is currently lower than your request !!");
                    break;
                }
                if(indexCrt == -1) Cart.add(new CartItem(id, qty));
                else Cart.get(indexCrt).setQTY(qty + Cart.get(indexCrt).QTY); 
            }
            catch (Exception e)
            {
                System.out.println("!! Invalid Entered Value !!");
            }
            break;

            case "2":
            System.out.println("\n\n========== Cart Management =========");
            System.out.println("============= Cart ============\n");
            System.out.println("ID | Quantity");
            System.out.println(Cart);
            System.out.println("\nTotal Price: THB " + totalPrice());
            System.out.println("\n=========== End of List ==========\n");
            System.out.println("========== Remove Product =========\n");
            System.out.print("Enter ProductID you wish to remove here: ");
            try
            {
                int n = inCM.nextInt();
                if(findCartItemIndex(n) != -1) Cart.remove(findCartItemIndex(n));

            }
            catch(Exception e)
            {
                System.out.println("!! Invalid Entered Value !!");
            }
            break;

            case "3":
            System.out.println("\n\n========== Cart Management =========");
            System.out.println("============= Cart ============\n");
            System.out.println("ID | Quantity");
            System.out.println(Cart);
            System.out.println("\nTotal Price: THB " + totalPrice());
            System.out.println("\n=========== End of List ==========\n");
            System.out.println("========== Update Product =========\n");
            System.out.print("Enter ProductID you wish to update here: ");
            try
            {
                int j = inCM.nextInt();
                int indexCrt = findCartItemIndex(j);
                if(indexCrt == -1)
                {
                    System.out.println("!! No ProductID " + j + " In Record !!");
                    break;
                }
                else {
                    System.out.print("Enter new quantity you wish to update here: ");
                    int nQTY = inCM.nextInt();
                    int indexItm = findItemIndex(j);
                    if(Items.get(indexItm).StockQTY < nQTY)
                    {
                        System.out.println("!! ProductID " + j + "\'s Stock is currently lower than your request !!");
                        break;
                    }
                    Cart.get(indexCrt).setQTY(nQTY);
                }
            }
            catch(Exception e)
            {
                System.out.println("!! Invalid Entered Value !!");
            }
            break;

            case "4":
            if(Cart.size() == 0)
            {
                System.out.println("!! The Cart is Empty !!");
                break;
            }
            System.out.println("\n\n================ Invoice ================");
            System.out.println("               MUICT Co.Ltd.");
            System.out.println("       999 Phutthamonthon Sai 4 Rd.");
            System.out.println(" Salaya Subdistric Phutthamonthon Distric");
            System.out.println("       Nakhornpathom Province 73170");
            System.out.println("==========================================");
            System.out.println("   ID | Name | Description | QTY | Price");
            for(int i = 0; i < Cart.size(); i++)
            {
                int ItmIndx = findItemIndex(Cart.get(i).productID);
                System.out.println("   " + Items.get(ItmIndx).ID + " : " + Items.get(ItmIndx).Name + " : "
                + Items.get(ItmIndx).Description + " : " + Cart.get(i).QTY + " : " + Cart.get(i).QTY*Items.get(ItmIndx).Price);
                Items.get(ItmIndx).setStock(Items.get(ItmIndx).StockQTY - Cart.get(i).QTY);
            }
            System.out.println("==========================================");
            System.out.println("Net Total: THB " + totalPrice());
            System.out.println("==========================================");
            Cart.clear();
            break;

            default:
            sessionCM = false;
            break;
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String opt;
        while (session)
        {
            System.out.println("\n\n===== E-Commerce Cart System =====");
            System.out.println("============ Main Menu ===========\n");
            System.out.println("1: Product Management");
            System.out.println("2: Cart Management\n");
            System.out.println("==== Enter other keys to exit ====\n");
            System.out.print("Enter your option here: ");
            opt = in.nextLine();

            switch(opt)
            {
                case "1":
                sessionPM = true;
                while(sessionPM)
                {
                    ProductManagement();
                }
                break;

                case "2":
                sessionCM = true;
                while(sessionCM)
                {
                    CartManagement();
                }
                break;

                default:
                session = false;
                break;
            }
        }
        System.out.println("\n====== Closed ======");
        in.close();
    }
}
