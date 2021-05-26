package HackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;

class UsernameValidator{
        /*
         * Write regular expression here.
         */
    String Pattern= "^([a-zA-Z])+(\\w{7,29})+$";
        public static final String regularExpression = null;
    }


    public class Solution21 {
        private static final Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
            int n = Integer.parseInt(scan.nextLine());
            while (n-- != 0) {
                String userName = scan.nextLine();

                if (userName.matches(UsernameValidator.regularExpression)) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            }
        }
    }

