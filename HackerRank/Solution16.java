package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Solution16 {


    static  boolean isAnagram(String a, String b) {
            // Complete the function
        if ( a.length() != b.length() )
            return false;

        // Remove all the white space
           char [] ca = a.replaceAll("\\s", "").toLowerCase().toCharArray();
           char [] cb = b.replaceAll("\\s", "").toLowerCase().toCharArray();

           Arrays.sort(ca);
           Arrays.sort(cb);

           return ca.equals(cb);//true or false

     /*   int Ascii = 0;
        for(int i =0; i<ca.length;i++){

             Ascii ^= ca[i]^cb[i];
        }
            return Ascii==0;*/



        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }

