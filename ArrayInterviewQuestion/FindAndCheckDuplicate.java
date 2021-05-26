package ArrayInterviewQuestion;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAndCheckDuplicate {

    /**
     * quick way of checking if a Java array contains duplicates or not is to convert
     * that array into Set. Since Set doesn’t allow duplicates size of the corresponding
     * Set will be smaller than the original Array if Array contains duplicates otherwise
     * the size of both Array and Set will be the same.
     *
     * */
    public static void main(String[] args) {


        String [] duplicates= new String[]{"one","two","three","one"};
        String [] withoutDuplicates = new String[] {"one","two","three"};

        System.out.println("Without duplicates using list and set : using only hashset "+duplicateCheck(withoutDuplicates)+" : "+
                duplicateCheckHashSet(withoutDuplicates));


        System.out.println(duplicateCheck(duplicates));
        System.out.println(duplicateCheckHashSet(duplicates));

    }

    /**
     * Compare the size of the array from list and set
     * as set does'nt take duplicates the size will be short
     * */
    public static boolean duplicateCheck(String [] iArray){
        /**
         * converting array into list and then to set
         * set will not take any duplicates
         * */
        List <String> list = Arrays.asList(iArray);
        Set  set = new HashSet(list);
        if (list.size()>set.size()){
            return  true;
        }else
            return false;

    }
    /**
     * using hashSet as it will (add()) check before adding the element
     * in the set if it is already there or not
     * duplicates are not allowed in set
     * */

    public static boolean duplicateCheckHashSet(String [] iArray){
        Set tSet = new HashSet();
        for (String str:iArray){
            if (!tSet.add(str)){
                return true;
            }
        }
        return false;

    }
}
