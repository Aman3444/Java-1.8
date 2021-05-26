package Practice.StringIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class TopicString {
    public static void main(String[] args) throws IOException {

        /*Write in aa file */
      /* try {
            BufferedWriter bf = new BufferedWriter(new FileWriter("myWords.txt"));
            for(int i=1;i<=10;i++){
                bf.write(i +" Hello world Numbers ");
                bf.newLine();

            }

            *//*bf.write("Hello World ");
            bf.newLine();
            bf.write("Hello World");
            bf.newLine();
            bf.write("Hello World");
           bf.newLine();
            bf.write("Hello World ");*//*
            bf.flush();
            bf.close();//close your resources or it will end in memory leak



        } catch (IOException e) {
            e.printStackTrace();
        }*/



        /*How to read from a a file */
        BufferedReader reader = new BufferedReader(new FileReader("myLines.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("myWords.txt"));

        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        StringBuilder stringBuilder2 = new StringBuilder();
        String line2 = null;
        String ls = System.getProperty("line.separator");
        String ls2 = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
        while ((line2 = reader2.readLine()) != null) {
            stringBuilder2.append(line2);
            stringBuilder2.append(ls2);
        }
        // delete the last new line separator
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();
        stringBuilder2.deleteCharAt(stringBuilder2.length() - 1);
        reader2.close();

        String content = stringBuilder.toString();
        String content2 = stringBuilder2.toString();
        //System.out.println(content);
        //System.out.println(content2);



        String [] sL = content.split(" ",0);
        String [] sW = content2.split(" ",0);
        List<String> wordList1 = new ArrayList<>(Arrays.asList(sL));
        List<String> wordList2 = new ArrayList<>(Arrays.asList(sW));
        List<String> merge =new ArrayList<String>();


         merge.addAll(wordList1);
         merge.addAll(wordList2);
        HashSet<String> similar = new HashSet<String>(merge);
        similar.removeAll(wordList1);
        System.out.printf("%s",similar);







      /*  List<String> result1 = Arrays.asList();
        List<String> result2 = new ArrayList<String>();
        List<String> result3 = new ArrayList<>();

        try {
            StringBuffer br1 = new StringBuffer("myLines.txt");
            StringBuffer br2 = new StringBuffer("myWords.txt");
       //     System.out.println(br.readLine());for

            for(String x)


            while (br2.ready()) {
            result2.add(br2.readLine());
              //  result.add(br.readLine());
            }

           // lamda expression using the stream of objects
           // br2.lines().forEach(str-> System.out.println(str));


           *//* for(String myline:result1){
                for (String mywods :result2) {
            if (myline.equals(mywods)){
                result1.remove();
            }
                }
            }*//*
               }   catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(result1);
        //System.out.println(result2);


     result1.addAll(result2);


        //result2.remove(result1);

        ///*/

/*
        try {
            InputStream is = new FileInputStream(new File("Test.txt"));
        //  int i = is.read();
            int i =0;
          while( (i = is.read())!=-1)
            System.out.print((char) i);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

    }
}