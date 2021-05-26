import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class scratch_1 {
    public static void main(String[] args) {
        String s1 = "The quick brown fox jump";
        String s2 = "The brown jump";

        String [] sa = s1.split(" ",0);
        String [] sb = s2.split(" ",0);

        List<String> asl1 = Arrays.asList(sa);
        List<String> asl2 = Arrays.asList(sb);

        HashSet<String> similar = new HashSet<String>(asl1);
        similar.removeAll(asl2);


        for(String x : similar){
            System.out.print(x + " ");
        }




    }
}