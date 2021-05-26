package Practice.ArraysAndStrings;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopicString {
    public static void main(String[] args) throws IOException {

        //creats an empty arraylist then adding the elements
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(22);
        arrayList.add(45);

        //creating s an arrays in a list formate and added the elements
        List<Integer> arrayList1 =  Arrays.asList(new Integer[]{10,5,1,5,1,58,84,5,5,5,5});

        //conevrting the list of array into the integer array
        Integer [] newArray =  arrayList1.toArray(new Integer[arrayList1.size()]);


            try {
                BufferedWriter fout = new BufferedWriter(new FileWriter("D:\\New folder\\bostonTuts\\src\\test.txt"));
                for (Integer a : newArray) {
                    System.out.println(a);
                    Integer b = newArray[a];
                    fout.write(a);
                    fout.flush();
                }
                fout.close();
            }
            catch(Exception e ){
                System.out.println(e);
            }
        }





    }

