package Tutorials.Polymorphism.AbstaractAndConcreate;

public class apples {

    public static void main(String[] args) {



        food obj1[]=new food[2];
        obj1[0]= new potpie();
        obj1[1]=new tuna();


        for (int x=0;x<2;x++){
        obj1[x].eat();
        obj1[x].sum();
        }

        System.out.println();
        System.out.println("calling different calsss method withourt extending " );

      //  food fo = new food();// if using food as an abstartc classs an aobject of that class can
        // be created kind of un accessible
        food fo = new tuna();
        fatty obj2 = new fatty();
        obj2.digets(fo);


        fo.sam();

    }
}
