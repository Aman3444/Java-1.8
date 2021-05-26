package TutorialIntermediate.Recursion;

public class bucky {


    /**
     *  factorial for any method */

       public static void main(String[] args) {


           System.out.println(fact(5));
    }
    //method for "what recursion is "

    public static long fact(long n){
           if(n<=1)
               return 1;
           else
               return  n*fact(n-1); ///factorial method


    }

}
