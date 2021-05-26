package TutorialIntermediate.Collection.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class bucky {
    public static void main(String[] args) {


        //create arrya and convert to a list
        String[] stuff = {"apple", "bob", "ham","bob","bacon"};
        List<String> list = Arrays.asList(stuff);

        System.out.printf("%s ", list);
        System.out.println();

        //hash set doesnt take any duplicate so add the list to Hashset
        Set<String> set = new HashSet<String>(list);
        System.out.printf("%s ", set);
    }
}
