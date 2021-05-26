package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int max =Integer.MIN_VALUE;

        for (int i = 0; i<6;i++){
            for (int j = 0;j<6;i++ ){
                arr[i][j]= sc.nextInt();
                if (i>1&&j>1){
                  int  sum = arr[i][j]
                            +arr[i][j-1]
                            +arr[i][j-2]
                            +arr[i-1][j-1]
                            +arr[i-2][j]
                            +arr[i-2][j-1]
                            +arr[i-2][j-2];
                if (sum>max){
                    max= sum;
                }
                }

            }

        }
        System.out.println(max);

        }

    }

