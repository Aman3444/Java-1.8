package TutorialIntermediate.Collection.CollectionMethodSort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Bucky {

    public static void main(String[] args) {
        String [] a ={"apples","lemons","geese","bacon","youtube","salmon"};
        List<String> list = Arrays.asList(a);

        //default sorting order
        Collections.sort(list);
        System.out.printf("%s ", list);
        //Reverse sorting order
        Collections.sort(list,Collections.reverseOrder());
        System.out.printf("%s ", list);



    }
}
