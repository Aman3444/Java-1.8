import java.util.Scanner;
import java.util.Random;

public class tut4Support {
    //instance variables which is out side the methods but in the class
    private String girlname;
    Scanner input = new Scanner(System.in);

    public tut4Support(String name) {
        girlname = name;

    }

    public String getGirlname() {
        return girlname;
    }

    public void setGirlname(String girlname) {
        this.girlname = girlname;
    }

    public void saying() {
        System.out.println("Your first girlfriend was " + getGirlname());
    }

    public void elif() {
        int age = 55;
        if (age >= 60)
            System.out.println("you are senior ");

        else if (age >= 50)
            System.out.println("you are in 50ties");

        else if (age >= 40)
            System.out.println("you are in your fourties");
        else
            System.out.println("you are young ");
    }

    public void conditionOp() {
        int age = 21;                //first true then false
        System.out.println(age > 50 ? "you are old" : "you are young");
    }

    public void averageNumb() {
        double total = 0;
        double grade, average;
        int count = 0;
        while (count < 10) {
            System.out.println("Enter a new numbers :");
            grade = input.nextInt();
            total += grade;
            count++;
        }
        average = total / 10;
        System.out.println("The average of the then numbers is :" + average);
    }

    public void math(){
        Random dice = new Random();
        int numb;
        for (int count = 1; count <= 10; count++) {
            numb = 1 + dice.nextInt(6);
            System.out.println(numb + " Out of dice");
        }
        // math operators
        System.out.println(Math.abs(-26.7));//26.7
        System.out.println(Math.ceil(7.4));//8 round up
        System.out.println(Math.floor(7.8)); //7 round down to 7
        System.out.println(Math.max(8.6, 5.2));// gives the max number 8.6
        System.out.println(Math.min(8.6, 5.2));// gives the mins for the number 5.2
        System.out.println(Math.pow(5, 3));//125//pow(n,3)= n*n*n
        System.out.println(Math.sqrt(9)); //square root of n

    }

    /**
     * Array is a variable that can store many value
     * it can only store values for same data type
     * <p>
     * indexes for array which let us store the values
     * starting from 0 to n-1
     */
    public void array() {
       /* int bucky[]=new int[10];//how many value will be stored in it
        bucky [0]=87;
        bucky [5]=25;
        bucky [9]=77;
        *//**
         * or use like this  */
        int bucky[] = {1, 55, 88, 77, 44, 99, 45, 14, 178, 88};
        System.out.println(bucky[9]);

        /**enhanced for loop
         **/
        int buck[] = {1, 5, 8, 9, 4, 7, 55};
        int tootal = 0;
        for (int x : buck) {
            tootal += x;
        }
        System.out.println("The total sum of array buck is :" + tootal);


        //craeting a table for our array bottom is the header
        System.out.println("Index\tValue\n_________________");
        for (int count = 0; count < bucky.length; count++) {
            System.out.println(count + "\t\t" + bucky[count]);
        }
        //sum of the array ellement
        int avg = 0;
        for (int count = 0; count < bucky.length; count++) {
            avg += bucky[count];
        }
        System.out.println("THe sum of the array is :" + avg);


    }

    public void randomArray() {
        Random dice = new Random();
        //made an array of size 7
        int numb[] = new int[7];
        for (int roll = 1; roll < 1000; roll++) {
            //making the random number for 1-6 from 1000 numbers
            ++numb[1 + dice.nextInt(6)];
        }
        System.out.println("Face\tFrequency");
        for (int face = 1; face < numb.length; face++) {
            System.out.println(face + "\t\t" + numb[face]);

        }//calling the method
        change(numb);
        for (int y : numb)
            System.out.println(y);
    }


    public static void change(int x[]) {
        for (int count = 0; count < x.length; count++) {
            x[count] += 6;
        }

    }


    public void multiDimentional()  {
        //first row and second row
        int f1[][] = {{8, 9, 9, 4, 5}, {1, 2, 3, 4, 5, 6}};
        int f2[][] = {{30, 40}, {1, 2, 3}, {1, 2, 3, 4, 5, 6, 7, 8, 9}};
        System.out.println("first array ");
        display(f1);
        System.out.println("second array ");
        display(f2);

    }

    public static void display(int x[][]){
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < x[row].length; col++) {
                System.out.print(x[row][col] + "\t");
            }
            System.out.println();
        }
    }


    public static int average(int... numbers) {
        int tot = 0;
        for (int x : numbers) {
            tot += x;
        }
        return tot / numbers.length;


    }



}
