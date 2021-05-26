package Tutorials.Polymorphism.AbstaractAndConcreate;

abstract class food {

    public abstract void sam();

    void eat(){
        System.out.println("This food is Great");
    }

    void sum(){
        int x=50*25;
        System.out.println("The sum of this method numbers is :"+x);
    }
}
