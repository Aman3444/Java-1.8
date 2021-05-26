package Tutorials.Final;

public class tuna {
    private int sum;

    //final variables  cannot be chnaged
    private final int numb;


    tuna(int x){
        numb=x;

    }
    public void add(){
        sum+=numb;

    }

    public String toString(){
        return String.format("Sum = %d\n",sum);
    }
}
