package TutorialIntermediate.Collection.AddAllMethod;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class bucky {

    public static void main(String[] args) {
        //convert stuffarray to a list
        String [] StuffArray = {"sam","jack","wax","Dogg"};
        List<String> StuffList = Arrays.asList(StuffArray);

        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("Youtube");
        list2.add("Google");
        list2.add("Diggy");

        for (String y :list2)
            System.out.printf("%s ",y );

        Collections.addAll(list2,StuffArray);
        System.out.println();

        for(String x : list2)
            System.out.printf("%s ",x );
        System.out.println();


        //check and print the occurance of the "" (Frequency)
        System.out.println(Collections.frequency(list2,"Diggy"));


        //checking for common names ()disjoint()
        boolean tof = Collections.disjoint(StuffList,list2);
        System.out.println(tof);

        //if true
        if(tof)
            System.out.println("Lists doesn't have anything in common");
        else//if false
            System.out.println("This lists must have something in common");




    }
}
