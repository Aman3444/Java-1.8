package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution22 {
    public static void main(String[] args) {

     /*   Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            boolean matchFound = false;
            String line = in.nextLine();// groups 1     2      3
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher match = pattern.matcher(line);
            while(match.find()){
                System.out.println(match.group(2));
                matchFound = true;
            }
            if (!matchFound)
            {
                System.out.println("None");
            }
            testCases--;
        }
    }
}*/

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int i = A.length();
        int j = B.length();

        System.out.println(i + j);
        if (A.compareTo(B)>0)
            System.out.println("Yes");

        else System.out.println("No");

        System.out.println((A.substring(0,1).toUpperCase()+A.substring(1,i))+" "+B.substring(0,1).toUpperCase()+B.substring(1,j));
    }
}

