public class ProductItem {
    private static int runningID = 0;
    protected int ID;
    protected String Name;
    protected String Description;
    protected double Price;
    protected int StockQTY;

    public ProductItem(String name, String des, double price, int qty)
    {
        runningID++;
        this.ID = runningID;
        this.Name = name;
        this.Description = des;
        this.Price = price;
        this.StockQTY = qty;
    }

    public void setPrice(double price)
    {
        this.Price = price;
    }

    public void setStock(int qty)
    {
        this.StockQTY = qty;
    }

    public String toString()
    {
        return "" + ID + " : " + Name + " : " + Description + " : " + Price + " : " + StockQTY;
    }
}
