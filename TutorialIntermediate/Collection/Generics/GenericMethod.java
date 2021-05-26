package TutorialIntermediate.Collection.Generics;

public class GenericMethod {


    public static void main(String[] args) {

        //creating generic arrray
        Integer[] IntArray = {1, 2, 3, 4, 5};
        Character[] ChArray = {'b', 'u', 'c', 'k'};
        printme(IntArray);
        printme(ChArray);


    }

    //generic method (T means generic and will take any generic data type eg :- Integer, Character ,
    // Short ,Double )
    //T will take
    public static <T> void printme(T[] x){
        for(T b : x)
            System.out.printf("%s ", b);
        System.out.println();

    }


}
