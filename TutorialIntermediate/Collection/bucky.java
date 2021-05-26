package TutorialIntermediate.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class bucky {


    //set - type of list

    public static void main(String[] args) {

        String s[] = {"eggs", "lasers", "hats", "pie"};
        //list which is blank
        List<String> list1 = new ArrayList<String>();

        //add  array items to a list 1
        for (String x : s)
            list1.add(x);

        //adding moure things into the list 2
        String[] morethings = {"sam ", "jack","eggs"};
        List <String > list2 = new ArrayList<String>();

        for(String y:morethings)
            list2.add(y);

        System.out.println("Before removing the comman names from list1 By comparing list2");
        //before removing the common names
        //print out list 1
        System.out.print("First: ");
        for (int i=0;i< list1.size();i++)
            System.out.printf(" %s ",list1.get(i));
        System.out.println();
        System.out.print("Second :");
        for (int i=0;i< list2.size();i++)
            System.out.printf(" %s ",list2.get(i));
        System.out.println("\n");



        System.out.println("After removing comman name from list1 ");
        //editings the list 1
        editList(list1,list2);
        System.out.print("First: ");
        //after removing the come names from the list1
        //print out list 1
        for (int i=0;i< list1.size();i++)
            System.out.printf("%s ",list1.get(i));
        System.out.println();
        System.out.print("Second :");
        for (int i=0;i< list2.size();i++)
            System.out.printf(" %s ",list2.get(i));

    }



    ///method to remove common things from both the list
    public static void editList(Collection<String> l1, Collection<String> l2){
        Iterator<String>it =l1.iterator();
        while(it.hasNext()){//checks if list one contains more emplemets then go ahed
            if (l2.contains(it.next()))//next (checks the list1 and if l2 conatins() it )
                it.remove(); //then remove from it whic is an object of 1
        }
    }
}
