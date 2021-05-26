package DataStructureAndAlgorithms.Arrays;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        int [] a = {90,50,100,25,60,10,40,30};
        int temp=0;
        //number of iteration
        for (int i=1;i<a.length;i++){
           for (int j=0;j<a.length-1;j++){
               if (a[i]>a[j+1]){
                   temp=a[i];
                   a[j]=a[j+1];
                   a[j+1]=temp;

               }
           }
        }

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
