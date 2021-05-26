package TutorialIntermediate;

public class bucky {
    public static void main(String[] args) {


//how to check the string

        String[] words ={"funk","sam","chunck","jack"};

        //start
        for(String x: words){
            if(x.startsWith("fu"))
                System.out.println(x+" start with fu");

        }
        for (String x:words)
            if(x.endsWith("unk"))
                System.out.println(x+ "ends with unk");
    }
}
