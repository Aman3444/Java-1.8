import java.util.Scanner;

public class asm {

    private String name;
    private int nameId;
    double tempValue1;
    double tempValue2;
    Scanner sc = new Scanner(System.in);

    public double getTempValue1(double a) {
        return tempValue1;
    }

    public void setTempValue1(double tempValue1) {
        this.tempValue1 = tempValue1;
    }

    public double getTempValue2(double b) {
        return tempValue2;
    }

    public void setTempValue2(double tempValue2) {
        this.tempValue2 = tempValue2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setNameId(int nameId) {
        this.nameId = nameId;
    }




    public void exit() {
            System.out.println("Exiting the program");
            System.exit(0);
        }

        public void add(double tempValue1, double tempValue2) {
            double x =getTempValue1(tempValue1) +getTempValue2(tempValue2) ;
            System.out.println("The sum of given two numbers is : " + x);

        }

        public void sub(double tempValue1, double tempValue2) {
            double x = getTempValue1(tempValue1) -getTempValue2(tempValue2);
            System.out.println("The subtraction of given two numbers is : " + x);
        }

        public void multi(double tempValue1, double tempValue2) {
            double x = getTempValue1(tempValue1) *getTempValue2(tempValue2);
            System.out.println("Multiplication of given two numbers is : " + x);

        }
        public void Name (){
            System.out.println("Welcome to my program");
            System.out.println(" Enter a name :");
            String x = sc.next();
            checkString(x);
            setName(x);
            System.out.println(getName());
            System.out.println(" Enter the id  :");
            int y = sc.nextInt();
            setNameId(y);

        }
        public void UserInput(double tempValue1,double tempValue2){
            String snum1;
            asm x = new asm();
            x.Name();// enter the name of the system
            System.out.println("Enter the first number :   \n or x to exit anywhere in the program");
            snum1 = sc.next();
            setTempValue1(x.check(snum1));
            System.out.println("Enter the second number :");
            String snum2 = sc.next();
            setTempValue2(x.check(snum2));
            System.out.println(getTempValue1(x.check(snum1))+" : "+getTempValue2(x.check(snum2)));

        }
        public int check(String snum) {

            int value=0;
            if (snum.equals("exit") || snum.equals("x")) {
                    System.exit(0);
                } else {
                    value = Integer.parseInt(snum);
                    return value;
                }
            return value;
        }
    public void checkString(String str) {

        if (str.equals("exit") || str.equals("x")) {
            System.exit(0);
        }

    }

    public void simpleMessage(String name) {

        System.out.println("Hello " + name);
    }


}


