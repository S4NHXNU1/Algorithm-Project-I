import java.util.Arrays;

public class ArrayList{

    private ProductItem[] data;
    public ArrayList()
    {
        this(0);
    }

    public ArrayList(int n)
    {
        this.data = new ProductItem[n];
    }

    public void add(ProductItem n)
    {
        this.data = Arrays.copyOf(data, data.length + 1);
        this.data[data.length - 1] = n;
    }

    public ProductItem get(int i){
        return data[i];
    }

    public void set(int i, ProductItem n)
    {
        this.data[i] = n;
    }

    public void remove(int i)
    {
        ProductItem[] tempData = new ProductItem[data.length - 1];
        for(int j = 0; j < tempData.length; j++)
        {
            if(i + 1 == data.length)
            {
                tempData[j] = data[j];
            }
            else
            {
                if(j < i)
                {
                    tempData[j] = data[j];
                }
                else
                {
                    tempData[j] = data[j+1];
                }
            }
        }
        data = tempData;
    }

    public void clear()
    {
        this.data = new ProductItem[0];
    }

    public Boolean contains(ProductItem o)
    {
        for(ProductItem n : this.data)
        {
            if(n.equals(o)) return true;
        }
        return false;
    }

    public int size()
    {
        return this.data.length;
    }

    public String toString()
    {
        if(this.size() == 0) return "none";
        String str = "";
        for(int i = 0; i < data.length; i++)
        {
            if(i + 1 != data.length)
                str += data[i] + "\n";
            else
                str += data[i];
        }
        return str;
    }
}
