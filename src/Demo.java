public class Demo {
    public static void main(String[] args){
        // ArrayList<Integer> Int = new ArrayList<Integer>();
        // Int.add(1);
        // Int.add(2);
        // System.out.println(Int);
        // System.out.println(Int.size());

        // Int.add(3);
        // Int.add(4);
        // System.out.println(Int);
        // System.out.println(Int.size());

        // ArrayList<String> Str = new ArrayList<String>();
        // Str.add("ABC");
        // Str.add("DEFG");
        // System.out.println(Str);
        // System.out.println(Str.size());

        // Int.remove(2);
        // System.out.println(Int);
        // System.out.println(Int.size());

        // Str.clear();
        // System.out.println(Str);
        // System.out.println(Str.size());

        // Str.add("ABC");
        // System.out.println(Str.contains("ABC"));
        // System.out.println(Str.contains("DEFG"));

        LinkedList ID = new LinkedList();
        ID.add(new CartItem(0, 0));
        ID.add(new CartItem(1, 10));
        ID.add(new CartItem(2, 20));
        ID.add(new CartItem(3, 30));
        ID.add(new CartItem(4, 40));

        System.out.println(ID);
        System.out.println(ID.size());

        System.out.println(ID.remove(5));
        System.out.println(ID);
        // ID.remove();
        // System.out.println(ID);
        // System.out.println(ID.size());
        // ID.remove();
        // System.out.println(ID);
        // System.out.println(ID.size());
        // ID.remove();
        // System.out.println(ID);
        // System.out.println(ID.size());
        // ID.remove();
        // System.out.println(ID);
        // System.out.println(ID.size());
        // ID.remove();
        // System.out.println(ID);
        // System.out.println(ID.size());
    }
}
