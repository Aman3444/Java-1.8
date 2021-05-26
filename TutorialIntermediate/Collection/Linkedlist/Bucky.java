package TutorialIntermediate.Collection.Linkedlist;

import java.util.*;

public class Bucky {
    public static void main(String[] args) {
        String[] things = {"apples", "noobs", "pwages", "bacon", "goATS"};
        List<String> list1 = new LinkedList<String>();
        for (String x : things)
            list1.add(x);

        //adding things in linked list that e craeted
        String[] morethings = {"Sauges", "bacon", "goats", "Harrypotter", "goATS"};
        List<String> list2 = new LinkedList<String>();
        for (String y : morethings)
            list1.add(y);


        //liist adding
        list1.addAll(list2);
        list2 = null;


        printme(list1);
//        removeStuff(list1,2,5);
//        System.out.println();
//        printme(list1);
//        System.out.println();
    //  reverseMe(list1);

        reverseClearMe(list1,2);
       // printme(list1);

    }

    //print me
    private static void printme(List<String> list) {
        for (String a : list) // loop throughout the list
            System.out.printf("%s ", a);
        System.out.println();

    }

    //remove stuff
    private static void removeStuff(List<String> list, int from, int to) {
        list.subList(from, to).clear();
        list.add(4, "jay said");//from the list remove (from - to) elements

    }

    //reverse jstrings
    private static void reverseClearMe(List<String> list, int a) {
        ListIterator<String> boy = list.listIterator(list.size());
        List<String> l1 = new LinkedList<String>();
        ;//send all the elements in boy iterator
        while (boy.hasPrevious()){//loop thought while it has some thing // hasprevious(); move the cursorto the last object and
            l1.add(boy.previous());
        }
        System.out.println();
        System.out.println(l1);
       l1.subList(a,l1.size()).clear();
        System.out.println(l1);



        //List <String> boyy = Collections.singletonList(boy.previous());
        //for(String x : boyy)
            //System.out.println(x);


    }

//    private static void reverse(List<String> ll) {
//        ListIterator<String> boy = ll.listIterator(ll.size());//send all the elements in boy iterator
//        while (boy.hasPrevious())//loop thought while it has some thing // hasprevious(); move the cursorto the last object and
//            boy.previous();
//
//    }
}
