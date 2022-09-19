package CollectionsExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionExample {

/**
 * @param args the command line arguments
 */

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,1,2,3,5,8,13,21,34,55);
        System.out.println("Position of 21: " + Collections.binarySearch(list,21));

        // Here we have more collections methods
        // We can try different ones when we use arraylists in our code

    }


}
