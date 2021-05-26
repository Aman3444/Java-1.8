package Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class bucky {


    public static void main(String[] args) {
        String a[] = {"1", "2", "3", "4", "5"};
        int[] s = {1, 2, 3, 4, 5, 6, 7, 8};
        //print array
        for (int i = 0; i < a.length; i++) {
            if (i >= 0)
                System.out.println(a[i]);
        }
        System.out.println();
        int x = a.length;
        int y = s.length;
        while (x > 0) {
            System.out.println(a[(x - 1)]);
            x--;

        }
        System.out.println("\nPrinting only the even numbers index from an array");

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                System.out.println(s[i]);
            }
        }


    }


}


