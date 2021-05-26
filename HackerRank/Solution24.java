package HackerRank;

import java.io.*;
import java.math.*;




public class Solution24 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger isPrime = new BigInteger(n);
        if (isPrime.isProbablePrime(1))
            System.out.println("prime");
else
            System.out.println("not prime");


        bufferedReader.close();
    }
}
