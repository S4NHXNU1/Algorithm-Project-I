public class CartItem {
    protected int productID;
    protected int QTY;

    public CartItem(int ID, int QTY)
    {
        this.productID = ID;
        this.QTY = QTY;
    }

    public void setQTY(int qty)
    {
        this.QTY = qty;
    }

    public String toString()
    {
        return productID + " : " + QTY;
    }
}
