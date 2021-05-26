package HackerRank;

import java.sql.Array;
import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int array[] = new int[n];



        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        scan.close();

        System.out.println(GetmeArray(array));
    }
    private static int GetmeArray(int [] array) {

        int counter = 0;
        for (int k = 0; k < array.length; k++) {
            int sum = 0;
            for (int j = k; j < array.length; j++) {
                sum +=array[j];
                if (sum < 0) {
                    counter++;
                }
            }
        }
        return counter;
    }
}