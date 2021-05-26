package Tutorials.Static;

public class tuna {


    private String first;
    private String last;
    //ststic memebres can be seen by all the first name and last name
    private static  int members= 0;


    tuna(String fn, String ln){
        first=fn;
        last = ln;

        //static memebers
        members++;
        System.out.printf("Constructor for  %s  %s , members in the club: %d\n",first,last,members);

    }

    public String getFirst(){
        return first;
    }

    public String getLast() {
        return last;
    }

    public static int getMembers(){
        return members;
    }

}
