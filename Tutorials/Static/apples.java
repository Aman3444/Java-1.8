package Tutorials.Static;

public class apples {
    public static void main(String[] args) {


        tuna member1 = new tuna("megan", "fox");
        tuna member2 = new tuna("taylor", "Swift");
        tuna member3 = new tuna("megan", "sam");
        tuna member4 = new tuna("Natalie", "portmen");

        System.out.println();
        //with ststic just type the class name then . separator and method name
        System.out.println(tuna.getMembers());
        System.out.println(member2.getFirst());
        System.out.println(member2.getLast());
        //static so shared amongst all of the objects
        System.out.println(member2.getMembers());
    }
}