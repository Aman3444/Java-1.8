package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int line =0;
        ArrayList [] arrayLists= new ArrayList[size];
        for (int i = 0; i < size; i++) {
             line = sc.nextInt();
            arrayLists[i] = new ArrayList();
            for (int j = 0; j < line; j++) {
                arrayLists[i].add(sc.nextInt());
            }
        }
        System.out.println(arrayLists);

    }

}
