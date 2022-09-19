package CollectionsExamples;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("Yellow", "Blue",
                "Red", "Green", "Indigo");

        for (String s : collection) {
            System.out.println(s);
        }
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
