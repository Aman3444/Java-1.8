
import java.util.Scanner;


// simple calculation
public class tuts3 {
    public static void main(String[] args) {
        //scanner variable and system in (user input)
        Scanner sc = new Scanner(System.in);

        boolean s = false;
        asm object = new asm();

        while (!(s)) {
            double a = 0,b = 0;

            object.UserInput(a,b);
            System.out.println("Choose the operation");
            System.out.println("1. +, -, *    \n2. Subtract    \n3. Multiply  \n4.exit");
            String check = sc.nextLine();

            switch (check) {
                    case "1":
                        //double a=0,b=0;
                        object.add(a,b);
                        object.sub(a,b);
                        object.multi(a,b);
                        break;
                    case "2":
                        System.out.println("Enter your name :");
                        String name= sc.nextLine();
                        object.simpleMessage(name);
                        break;
                    case "3":

                        break;
                    case "4":
                        object.exit();
                    default:
                        System.out.println("Invalid selection exiting the program");
                        break;
                }
        }
        }

    }



