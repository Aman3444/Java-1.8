package HackerRank;

import java.util.Locale;
import java.util.Scanner;
import java.text.Format;
import java.text.NumberFormat;



public class Solution12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();


    // Write your code here.
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        //indian currency formatter is not there so we create a new one this way
        Locale indian = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(indian);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france  = NumberFormat.getCurrencyInstance(Locale.FRANCE);

    System.out.println("US: " + us.format(payment));
    System.out.println("India: " + india.format(payment));
    System.out.println("China: " + china.format(payment));
    System.out.println("France: " + france.format(payment));
}


}
