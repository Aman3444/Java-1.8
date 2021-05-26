package Practice.Collection;

import java.util.*;

public class ApplicationSecond {

    public static void main(String[] args) {


        /*Course cCode= new Course(15,"Computer Scince");
        System.out.println(cCode);//will inwoke thg toString method
        System.out.println(cCode.toString());


       ///using collection to make a list syncronized
        ArrayList<Integer> s1= new ArrayList<>();
        Collections.synchronizedList(s1);*/


       /* List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(1);
        l.add(11);
        l.add(25);
        l.add(7);
        l.add(12);
        l.add(15);
        l.add(77);
        System.out.println(l);
        Collections.sort(l);//default natural sorting
        System.out.println(l);
        //reverse order with comparator customized sorting order
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);*/


        ///for the course
       /* List <Course> cources = new ArrayList<>();
        cources.add(new Course(20,"Java"));
        cources.add(new Course(15,"C"));
        cources.add(new Course(10,"Python"));
        cources.add(new Course(12,"C++"));

        Collections.sort(cources);
        cources.forEach(System.out::println);
        //for this chnage the primitive type to wrapper class
        Collections.sort(cources,Collections.reverseOrder());
        cources.forEach(System.out::println);*/


        ///employees are sorted base on their name
        // and if the name is same then compare those two element and sort
        // by their id.

        List<Employee> emp = Arrays.asList(new Employee[]{
                        new Employee(10,"aam"),
                new  Employee(12,"jack"),
                new Employee(1,"lily"),
                new Employee(5,"samantha"),
                new Employee(25,"Sam"),
                new Employee(30,"jerry"),
                new Employee(22,"Tom")

        });

        //annonymous inner class for comparator can also be done by lambda ASexpression
        /*Collections.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmpId().compareTo(o2.getEmpId());
            }
        });*/

        //Lambda expresssion
        Collections.sort(emp, (o1, o2) -> o1.getEmpId().compareTo(o2.getEmpId()));
        emp.forEach(System.out::println);


    }
}
