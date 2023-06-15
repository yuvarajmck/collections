import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        Collections.addAll(collection,"c","b");
        var col = collection.toArray();
        var otherCol = collection.toArray(new String[0]);
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println(other.equals(collection));
        System.out.println(other==collection);
    }
}