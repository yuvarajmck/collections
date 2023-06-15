import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.set(0,"w");
        Collections.addAll(list, "c","d","y","s","y");
        list.remove("y");
        String a=list.get(0);
        System.out.println(a);
        int ind=list.indexOf("w");
        System.out.println(ind);
        System.out.println(list.subList(0,2));
        System.out.println(list);
    }
}