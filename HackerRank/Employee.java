package HackerRank;



public class Employee implements Comparable<Employee> {
    private String empName;
    private int salary;
    private int id ;

    public Employee(int id , String empName, int salary) {
        this.empName = empName;
        this.salary = salary;
        this.id =id;
    }



    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
