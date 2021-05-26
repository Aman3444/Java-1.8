package HackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class solution18 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
                //Write your code
            }
            catch(Exception e) {
                System.out.println("Invalid");
            }
            testCases--;


        }
    }
}



