package Practice.ArraysAndStrings;


import java.util.Arrays;

public class Application{

    int id ;
    String name;

    void assigned(int ID,String s ) {
        id =ID;
        name= s;

    }
        }

class stud {
    public static void main(String[] args) {


        String s1 = "String";//creates new strings obj
        String s2 = "String";//creates a new obj referencing to s1 value in heap
        String s3 = new String("String");//creating a new obj with Test value
        String s4 = new String(s2);// creating a new obj with s2
        // Intern() concept
        String s5= s3.intern();// copying the string object from heap into th pool

        /**
         * == operator is used for reference comparison (pointing to the same )
         * .equals() check  if the content is same or not in both object
         *
         * */

        System.out.println(s1==s2);//true
        //all of them is false
        System.out.println(s2==s3);
        System.out.println(s3==s4);
        System.out.println(s2==s4);


        //Intern ()
        System.out.println("sam coppied "+ (s1==s5));//true

        //All of them true
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s2.equals(s4));




        ///craeting an array
        int [] a = new int[]{1,2,3,4,5,6,7,8,9,0};
        //creating an empty array with the size 2
        int[] b = new int[10];
        //adding elements in array b
        b[0]=5;
        b[1]=50;
        b[2]=500;
        b[3]=5000;
        b[4]=2;
        b[5]=35;
        //Printing an array
        for (int i=0;i< b.length;i++){
            if(b[i]==0)
                System.out.println("This array is empty "+b[i] );
            else
            System.out.println(b[i]);
        }

        //enhanced for loop
        for (int x:a) {

            System.out.println("\nEnhanced loop");
            System.out.println(a[x]);
        }




        ///creating an object of the class
         Application a1= new Application();
        //assigning the value by reference
         a1.id=150;
         a1.name="Sam Jack ";
         //assign by method
         a1.assigned(502,"Aman");


        System.out.println(a1.id +":"+a1.name);



        int z= 97;
        double d= 97.0;
        char c ='a';//jvm reads as 97 its ascii value

        System.out.println(z==d);//true
        System.out.println(z==c);//true

    }





}
