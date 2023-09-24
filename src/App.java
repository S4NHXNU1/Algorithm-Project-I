import java.util.Scanner;

public class App {
    public static ArrayList Items = new ArrayList();
    public static LinkedList Cart = new LinkedList();
    public static boolean session = true;
    public static boolean sessionPM = true;

    public static int findItemIndex(int id)
    {
        for(int i = 0; i < Items.size(); i++)
        {
            if(Items.get(i).ID == id) return i;
        }
        return -1;
    }

    public static void ProductManagement()
    {
        Scanner in = new Scanner(System.in);
        String optPM;
        System.out.println("\n\n======== Prodect Management =======");
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
        optPM = in.nextLine();
        
        switch(optPM)
        {
            case "1":
            System.out.println("\n\n======== Prodect Management =======");
            System.out.println("=========== Add Product ==========\n");
            String name;
            String des;
            double price;
            int qty;
            try
            {
                System.out.print("Enter product name: ");
                name = in.nextLine();
                System.out.print("Enter product description: ");
                des = in.nextLine();
                System.out.print("Enter product price: ");
                price = in.nextDouble();
                System.out.print("Enter product stocked quantity: ");
                qty = in.nextInt();

                Items.add(new ProductItem(name, des, price, qty));
            }
            catch (Exception e)
            {
                System.out.println("!! Invalid Entered Value !!");
            }
            break;

            case "2":
            System.out.println("\n\n======== Prodect Management =======");
            System.out.println("========= List of Products ========\n");
            System.out.println("ID | Name | Description | Price | Stock");
            System.out.println(Items);
            System.out.println("\n=========== End of List ==========\n");
            System.out.println("========== Remove Product =========\n");
            System.out.print("Enter ProductID you wish to remove here: ");
            try
            {
                int n = in.nextInt();
                if(findItemIndex(n) != -1) Items.remove(findItemIndex(n));

            }
            catch(Exception e)
            {
                System.out.println("!! Invalid Entered Value !!");
            }
            break;

            case "3":
            System.out.println("Entered 3");
            break;

            default:
            sessionPM = false;
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
                System.out.println("Entered 2");
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
