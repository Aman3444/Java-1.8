package HackerRank;


interface FunctionalInt{
    void  Sumab(int a, int b);


    default void defMethod(){
        System.out.println("This is default method of FunctionalInt");
    }
}
interface DefaultExample {
    default void printFunction() {
        System.out.println("I am in default example ");

    }
    static void PrintFunction1(){
        System.out.println("I am in Static Example ");
    }
}


class derived implements DefaultExample{}

public class FunctionalExample {
    public static void main(String[] args) {

        //lambda
        FunctionalInt sum = (int a, int b) -> System.out.println("The sum of a, b  is : " + (a + b));
        sum.Sumab(5,5);
        sum.defMethod();


        //default Example
        derived obj = new derived();
        obj.printFunction();


        //static example
        try {
            DefaultExample.PrintFunction1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
