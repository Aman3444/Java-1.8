package TutorialIntermediate.StringCheck;

import java.util.Locale;

public class bucky {
    public static void main(String[] args) {


        //how to check the string
        String[] words ={"funk","sam","chunck","jack"};

        //start
        for(String x: words){
            if(x.startsWith("f"))
                System.out.println(x+" start with fu");

        }
        //check the end
        for (String x:words) {
            if (x.endsWith("k"))
                System.out.println(x + " ends with unk");
        }
        System.out.println();
        System.out.println("Index method for strings:");

        String s ="buckrobertbuckyroberts";
        System.out.println(s.indexOf("rob",10));


        ///concationation
        String a="Bacon";
        String b = "Monster";
            //weak practice
        System.out.println(a+b);

        //use this instead
        System.out.println(a.concat(b));
        //replace method
        System.out.println();
        System.out.println(a.replace('b','f'));


        System.out.println();

        //caplital
        System.out.println(b.toUpperCase(Locale.ROOT));
        System.out.println();


        //how to handle space trim ()
        String ss="    Monster    ";
        System.out.println(ss.trim());



    }
}
