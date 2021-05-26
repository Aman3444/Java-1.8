package TutorialIntermediate.Collection.Generics;

public class bucky {

    public static void main(String[] args) {
        Integer [] IntArray = {1,2,3,4,5};
        Character [] ChArray = {'b','u','c','y'};


        printme(IntArray);
        printme(ChArray);


    }

    private static void printme(Integer[] intArray) {
        for(Integer x:intArray)
            System.out.printf("%s ", x);
        System.out.println();
    }

    private static void printme(Character[] chArray) {
        for(Character x:chArray)
            System.out.printf("%s ", x);
        System.out.println();
    }
}
