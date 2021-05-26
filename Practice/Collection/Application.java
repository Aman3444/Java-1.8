package Practice.Collection;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Integer s;


        ArrayList<Integer> sam = new ArrayList<>();
        sam.add(20);
        sam.add(255);


        //lamda expression (Also known as functional programming )
        sam.forEach(i -> System.out.println(i));

        //method refernce used for functional peogramming mainly
        sam.forEach(System.out::println);


    }
}
