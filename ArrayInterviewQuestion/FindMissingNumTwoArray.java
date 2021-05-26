package ArrayInterviewQuestion;

import java.util.Hashtable;

public class FindMissingNumTwoArray {


    public static void main(String[] args) {
        int [] first = new int[]{1,2,3,4,5};
        int [] second = new int[]{2,3,1,0,5};

        for (int n :first){
            if (!isPresent(n,second)){
                System.out.println("Misssing number is :" +n);
                break;
            }
        }

    }

    private static boolean isPresent(int n, int[] second) {
        for (int i:second){
            if (n==i){
                return true;

            }
        }
        return false;
    }
}
