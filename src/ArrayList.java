import java.util.Arrays;

public class ArrayList<E> {

    private Object[] data = new Object[0];
    public ArrayList()
    {

    }

    public ArrayList(int n)
    {
        this.data = new Object[n];
    }

    public void add(E n)
    {
        this.data = Arrays.copyOf(data, data.length + 1);
        this.data[data.length - 1] = n;
    }

    public Object get(int i){
        return data[i];
    }

    public void set(int i, E n)
    {
        this.data[i] = n;
    }

    public void remove(int i)
    {
        Object[] tempData = new Object[data.length - 1];
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
        this.data = new Object[0];
    }

    public Boolean contains(E o)
    {
        for(Object n : this.data)
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
