package ArrayInterviewQuestion;

 class ChildThread extends Thread{
    @Override
    public void run() {
        System.out.println("no args method ");
    }
    public void run(int i){
        System.out.println(i+" int args method of run ");
    }

     @Override
     public synchronized void start() {
         System.out.println("Start method");
     }
 }
public class SecondLargeNumber{
    public static void main(String[] args) {
        ChildThread t = new ChildThread();
        t.start();
        System.out.println("main method");
    }
}