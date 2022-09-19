package CollectionsExamples;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<>();
        states.add("Alaska");
        states.add("New-York");
        states.add("Wisconsin");
        states.add("Pennsylvania");
        //Here last item indicates to the null.
        // First item indicates to the next item.
        states.addFirst("Alabama");
        System.out.println(states);
        System.out.println("Last State: " + states.getLast());
//        Iterating linkedList backwards
// Inside listIterator we specify the exact size of a list.
        ListIterator<String> iterator = states.listIterator(states.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
