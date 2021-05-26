package DataStructureAndAlgorithms.Arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int [] a = {10,20,30,40,50,60};
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();
        int flag =0;
        int low =0;
        int high =4;
        while (low<high) {
            int mid = (low+high)/2;
            if (key == a[mid]) {
                flag = 1;
                break;
            }else if (key <a[mid]){
                high= mid-1;

            }else low= mid+1;
        }
        if (flag==1){
            System.out.println("Key found");
        }else
            System.out.println("Not found");




    }
}
