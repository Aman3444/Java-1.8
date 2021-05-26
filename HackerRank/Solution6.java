package HackerRank;

import java.util.Scanner;

public class Solution6 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int x=0;x<n;x++) {
                int j = (int) Math.pow(2,x);
                a=a+ (j*b);
                System.out.print(a+" ");
            }
            System.out.println();
        }
        in.close();
    }

}
