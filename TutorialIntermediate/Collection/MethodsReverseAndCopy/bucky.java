package TutorialIntermediate.Collection.MethodsReverseAndCopy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class bucky {
    public static void main(String[] args) {
        //create an array and concert to list
        Character [] array = {'p','w','n','c','o'};//char array
        List<Character> list = Arrays.asList(array);
        System.out.println("Printing the list : ");
        output(list);

        //reverse and print out the list
        Collections.reverse(list);
        System.out.println("After the list is reveresed : ");
        output(list);


        //create a new array and a new list
        Character[] Newarray = new Character[5];
        List<Character> Newlist = Arrays.asList(Newarray);


        //copy content of list into new list copy
        Collections.copy(Newlist,list);
        System.out.println("After Coping the List Into a Newlist : ");
        output(Newlist);


        //fill collection with random stuff
        Collections.fill(list,'X');
        System.out.println("After filling the list with random things");
        output(list);
    }

    private static void output(List<Character> l) {
        for(Character cha : l)
            System.out.printf("%s ",cha);

        System.out.println();
    }
}
