package HackerRank;


interface screen{
    void display();
}
class derived_class {
    public derived_class() {
        System.out.println("this is from the constructor Refernce ");
    }

    static void  Method1(){
        System.out.println("derived class ");
    }
}


public class MethodReference {
    public static void main(String[] args) {
        //Instance method refernce
       /* derived_class cls = new derived_class();
        screen ref = cls::Method1;
        ref.display();*/


        // static refernce
        /*screen ref = derived_class::Method1;
        ref.display();
*/
        //constructor refernce
        screen ref = derived_class::new;
        ref.display();


    }
        }
