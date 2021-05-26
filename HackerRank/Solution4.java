package HackerRank;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            int a =s1.length();
            if(a !=15) {
                for (int j = a; j < 15; j++) {
                    s1 = s1 + " ";
                }
            }
            String xx= String.format("%03d",x);
            System.out.println(s1+""+xx);
            //Complete this line
        }
        System.out.println("================================");

    }
}
