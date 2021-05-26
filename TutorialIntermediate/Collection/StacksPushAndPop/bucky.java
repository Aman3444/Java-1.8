package TutorialIntermediate.Collection.StacksPushAndPop;

import java.util.Stack;

public class bucky {
    public static void main(String[] args) {
        //Stack- lots of thing
        //push - put something on top of stack
        //pop - remove something from the top


        Stack<String> stack = new Stack<String>();
        stack.push("First at the bottom");
        PrintStack(stack);
        stack.push("Second");
        PrintStack(stack);
        stack.push("Third");
        PrintStack(stack);
        stack.push("Fourth");
        PrintStack(stack);
        System.out.println();

        System.out.println("Now we are going to pop one by one");
        stack.pop();
        PrintStack(stack);
        stack.pop();
        PrintStack(stack);
        stack.pop();
        PrintStack(stack);
        stack.pop();
        PrintStack(stack);


    }

    private static void PrintStack(Stack<String> s) {
        if (s.isEmpty())
            System.out.println("You have nothing in your stack");
        else
            System.out.printf("%s Top\n", s);
    }
}
