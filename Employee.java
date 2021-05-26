import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        boolean s = false;
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        String check = null;



while(!(s)) {
    System.out.println("\nWelcome to boston tutorials\n1. operators \n2.increment operators\n3. if else"+
            "");
    check = sc.nextLine();

    //if elase statement is implemented:
    if (check.equals("exit")||check.equals("x")||check.equals("X")||check.equals("quit"))
    {
        System.out.println("Exiting program.....");
        System.exit(0);
    }
    switch (sc.nextInt()) {
        case 1:

            System.out.println("enter a number ");
            a = sc.nextInt();
            System.out.println("enter another number");
            b = sc.nextInt();
            c = a + b; // chage it for multiple (+,-,*,/,%)
            System.out.println("The sum of 2 numbers" + c);
            break;

        case 2:
            int tuna = 5;
            int bass = 18;
            // or  ++tuna;
            // -= +=, etc
            c=tuna +bass;//tuna += 9 etc
            System.out.println("tuna value :"+tuna++);//6 pre increment
            System.out.println(++tuna);//post increment  first take 5 than increase


            break;

        case 3:
            int y= 8;
            int z = 15;
            if (y!=8 && z>y){ // can use multiple operators >= <= > <  and logical ope
                System.out.println("the value of the y is not 8 :"+y);
                System.out.println("z value is less than y :"+ z);
                y++;
                 }else System.out.println("value of y is 8");

        case 4:
        default:



    }
}


    }
}
