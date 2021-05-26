import java.util.Scanner;

class tut4 {
     public static void main(String[] args) {
       /**  Scanner sc = new Scanner(System.in);
         passsing the value with in the constructor
         */
       tut4Support tut = new tut4Support("sam jack");
        // tut4Support tut2 = new tut4Support("Fiona");


/*         System.out.println("Enter the name of tour girl name:");
         String temp = sc.nextLine();
         tut.setGirlname(temp);
         tut.saying();
         tut2.saying();
         //if else, else if
         tut.elif();
         tut.averageNumb();
         tut.math();
         tut.randomArray();
*/
        tut.multiDimentional();
         System.out.println("avarge of the randomly added number is ");
         System.out.println(tut.average(45,85,78,45,96,7,8));
        // tut.array();
     }




}
