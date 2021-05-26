package TutorialIntermediate.Collection.LinkedListToArray;

import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Bucky {

    //Converting List to array and array to list

    public static void main(String[] args) {
        String [] stuff = {"Babies", "watermelons","melons","Apples","Jackets"};
        //how to pass an array in a list
        LinkedList<String> list = new LinkedList<String>(Arrays.asList(stuff));
        System.out.println(list);

        list.add("jay");
        list.addLast("whats upp");
        list.remove(1);
        System.out.println(list.get(2));


        //covert list back to array
        stuff=list.toArray(new String[list.size()]);
        for (String x: stuff)
            System.out.printf("%s ",x);


    }
}
