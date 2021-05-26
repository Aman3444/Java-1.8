package HackerRank;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPI{
    public static void main(String[] args) {



        Employee [] arrayofEmp = {
                new Employee(1,"Jeff Benzo",10000),
                new  Employee(2," Jack sam",1255),
                new  Employee(3," Jack sam",25),
                new Employee(4,"Jeffery Benzo",2522),
                new Employee(5,"Jeff Salaman",1055)};

        List<Employee> EmpList = Arrays.asList(arrayofEmp);

        Optional<Employee> emp= EmpList.stream()
                .sorted()
                .filter(id->id.getId()%2!=0)
                .findFirst();
        Optional<Employee> emp2= EmpList.stream()
                .sorted()
                .filter(employee->employee!=null)
                .filter(e->e.getSalary()<=1055)
                .findAny();
        System.out.println(emp);
        System.out.println(emp2);
    }

}



