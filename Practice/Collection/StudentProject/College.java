package Practice.Collection.StudentProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class College {

    public static void main(String[] args) {

       /* List<Student> stud1 = Arrays.asList(new Student[]{
           new Student("Aman","Multani","Computer"),
                new Student("John","Doe","Computer"),
                new Student("Luke","Harper","Computer"),
                new Student("Robert","Dowry","Physics"),
                new Student("Adam","sandler","Zoology"),


        });*/
        List<Department> dep1= Arrays.asList(new Department[]{
                new Department("Aman","Multani",25,"Computer",1237988079),
                new Department("John","Doe",10,"Computer",1234562654),
                new Department("Luke","Harper",20,"Computer",1234255779),
                new Department("Robert","Dowry",5,"Physics",123326779),
                new Department("Adam","sandler",7,"Zoology",1133456779),



        });


        Collections.sort(dep1);
       dep1.forEach(System.out::println);


    }
}
