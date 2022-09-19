import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Yellow");
        strings.add("Yellow");
        strings.add("Blue");

        ArrayList<String> arrayList = gen_method(strings);
        System.out.println(arrayList);
    }


    public static <T extends Comparable<T>> ArrayList<T> gen_method(ArrayList<T> arrayList){
        boolean found = false;
        if(arrayList.size() == 0){
            return arrayList;
        }

        // Initializing a new list for non duplicate values
        ArrayList<T> list = new ArrayList<>();
        // We are adding at least one starting value.
        list.add(arrayList.get(0));
        // Looping through the rest of the list starting from 1
        // due to we already got the first element from list[0]
        for(int i = 1; i < arrayList.size(); i++){
            for (int j = 0; j < list.size(); j++){
                // Making sure if the values are the same;
                if(arrayList.get(i).compareTo(list.get(j))==0){
                    found = true;
                    break;
                }
            }
            if(!found)
                list.add(arrayList.get(i));
            found = false;
        }
        return list;
    }
}
