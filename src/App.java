public class App {
    public static void main(String[] args){
        ArrayList<Integer> Int = new ArrayList<Integer>();
        Int.add(1);
        Int.add(2);
        System.out.println(Int);

        Int.add(3);
        Int.add(4);
        System.out.println(Int);

        ArrayList<String> Str = new ArrayList<String>();
        Str.add("ABC");
        Str.add("DEFG");
        System.out.println(Str);

        Int.remove(2);
        System.out.println(Int);

        Str.clear();
        System.out.println(Str);
    }
}
