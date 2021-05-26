package Practice.Collection.StudentProject;

public class Student  implements Comparable<Student> {

    private String lName;
    private String fName;
    private String depName;

    public Student(String first, String last,String depName) {
        this.fName = first;
        this.lName = last;
        this.depName = depName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String deName) {
        this.depName = deName;
    }

    @Override
    public String toString() {

        return "Student[" +
                "lName='" + lName + '\'' +
                ", fName='" + fName + '\'' +
                ", depName='" + depName + '\'' +
                ']'+"\n";
    }

    @Override
    public int compareTo(Student o) {
        if (this.depName.compareTo(o.getDepName())==0){
            return this.lName.compareTo(o.getlName());

        }else
            return this.depName.compareTo(o.getDepName());
    }
}
