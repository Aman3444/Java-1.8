package HackerRank;

import java.util.Scanner;

public class Solution17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        if (s.length()==0){
            System.out.println(0);
        }
        if (s.length() != 0) {
            String[] str1 = s.split( "[!,?._'@\\s]+");
            System.out.println(str1.length);

            for (String Tokens : str1) {
                System.out.println(Tokens);

            }
        }


        scan.close();

    }
}
