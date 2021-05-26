package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream {

    public static void main(String[] args) {
        List<Integer> s= new ArrayList<>();
       Integer [] a={1,2,3,5,6,8,9,10,12,13,15,17};
        List<Integer> l1 = Arrays.asList(a);
       for(int i=0; i<a.length;i++){

                //System.out.println(a);
           try {
               if (((a[i + 1]) - a[i]) > 1) {
                   System.out.println(a[i] + 1);
                   continue;
               }
           }catch (Exception ignored) {
               ignored.printStackTrace();
           }

        }

        Optional<Integer> a1 = l1.stream().filter(num->num%7==0).findFirst();
        System.out.println(a1);



    }


}
