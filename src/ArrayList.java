import java.util.Arrays;

public class ArrayList<DataType> {
    private Object[] data = new Object[0];
    
    public ArrayList()
    {

    }

    public void add(DataType n)
    {
        this.data = Arrays.copyOf(data, data.length + 1);
        this.data[data.length - 1] = n;
    }

    public Object get(int i){
        return data[i];
    }

    public void set(int i, DataType n)
    {
        this.data[i] = n;
    }

    public String toString()
    {
        String str = "[";
        for(int i = 0; i < data.length; i++)
        {
            if(i + 1 != data.length)
                str += data[i] + ",";
            else
                str += data[i];
        }
        str += "]";

        return str;
    }
}
