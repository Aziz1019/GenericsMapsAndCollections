package HahMaps;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Abdulaziz", 1019);
        phoneBook.put("Abdulloh", 2023);
        phoneBook.put("Police", 102);
// HashMaps and their values are not ordered. So our values will be printed in different order each time.
        System.out.println(phoneBook);
        if(phoneBook.containsKey("Abdulaziz")){
            phoneBook.remove("Abdulaziz");
        }
        // We can also clear the whole HashMap Values
        phoneBook.clear();
        System.out.println(phoneBook);


    }
}
