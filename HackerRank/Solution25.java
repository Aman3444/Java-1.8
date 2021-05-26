package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution25{

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger n = BigInteger.valueOf(Long.parseLong(bufferedReader.readLine()));
        BigInteger m = BigInteger.valueOf(Long.parseLong(bufferedReader.readLine()));
        System.out.println(n.add(m));
        System.out.println(n.multiply(m));*/


        Scanner sc = new Scanner(System.in);
        BigInteger num1 = sc.nextBigInteger();
        BigInteger num2 = sc.nextBigInteger();
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));

            }
}