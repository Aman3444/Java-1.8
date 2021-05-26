package TutorialIntermediate.Collection.Queue;

import java.util.PriorityQueue;

public class bucky {

    public static void main(String[] args) {


        //Queue means in a line
        //store in a priority order
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.offer("First");//add - and its priority is high (1)
        queue.offer("Second");//prority is low than 1
        queue.offer("Third");

        System.out.printf("%s ",queue);
        System.out.println();
        System.out.println();
        System.out.println("Getting the highest priority element");
        System.out.printf("%s ", queue.peek());//peek() - return the element with hightest priority
        System.out.println();
        System.out.println("Removing the highest priority element");
        queue.poll();//removes the higest priority element
        System.out.printf("%s ",queue);
    }

}
