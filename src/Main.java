public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        for(String s:list){
            System.out.println(s);
        }
    }
}