package Practice.Collection;

import java.io.Serializable;
import java.util.Objects;

public class Employee {
    //implements Cloneable, Serializable,Comparable<Employee> {
    private Integer empId;
    private String empName;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Employee(int id, String eName) {
        super();
        this.empId = id;
        this.empName = eName;
    }


   @Override
    public String toString() {
        return "Employee[" +
                "empId=" + empId +
                ", empName= " + empName  +
                ']';
    }

   /*@Override
    public int compareTo(Employee o) {
        //compared by name and sort According to the name( A-Z )
        //return this.empName.compareTo(o.getEmpName());

                if (this.empName.compareTo(o.getEmpName())==0){
                    //iff the name is same then sort by id
                    return this.empId.compareTo(o.getEmpId());
                }else
                    return this.empName.compareTo(o.getEmpName());
    }*/


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId.equals(employee.empId) && empName.equals(employee.empName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName);
    }
}


