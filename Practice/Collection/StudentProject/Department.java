package Practice.Collection.StudentProject;

public class Department extends Student implements Comparable<Student>{


    private String dName;
    private int depId;
    private int depContactNumber;

    public Department(String first, String last,int id , String name, int number){
        super( first, last,name);
        this.depId=id;
        this.dName=name;
        this.depContactNumber=number;

    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public int getDepContactNumber() {
        return depContactNumber;
    }

    public void setDepContactNumber(int depContactNumber) {
        this.depContactNumber = depContactNumber;
    }

    @Override
    public String toString() {
        return "Department[" +
                "dName='" + dName + '\'' +
                ", depId=" + depId +
                ", depContactNumber=" + depContactNumber +
                ']'+" Student[" +
                "lName='" + super.getlName() + '\'' +
                ", fName='" + super.getfName() + '\'' +']'+"\n";
    }

    @Override
    public int compareTo(Student o) {

        if (this.dName.compareTo(o.getDepName())==0)
            return this.getlName().compareTo(o.getlName());
        else
            return this.dName.compareTo(o.getDepName());
    }


}
