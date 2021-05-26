package HackerRank;

import java.util.Scanner;

public class Solution2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
//
        if (N % 2 != 0)
            System.out.println("Weird");
        else if(N>=2&&N<=5)
            System.out.println("2 Not Weird");
        else if (N>=6&&N<=20)
            System.out.println("3 Weird");
        else if (N%2==0&&N>20)
            System.out.println("4 Not Weird");

        scanner.close();
    }
}
