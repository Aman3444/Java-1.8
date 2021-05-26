package HackerRank;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Locale;
import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {

/*
        Scanner sc = new Scanner(System.in);
        String A = sc.next().toLowerCase();
        String answer = "Yes";
        *//* Enter your code here. Print output to STDOUT. *//*
        int x = A.length() - 1;
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) == A.charAt(x - i))
                continue;
            else {
                answer = "No";
                break;

            }

        }
        System.out.println(answer);*/
        Scanner sc = new Scanner(System.in);
        String str0=sc.next();
        StringBuffer bf = new StringBuffer(str0);
        String str= bf.reverse().toString();

        if (str0.equals(str)){
            System.out.println("Yes");
        }else
            System.out.println("No");

    }
}
