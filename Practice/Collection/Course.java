package Practice.Collection;

import java.io.Serializable;
/**
 * clonable and serializable is a marker interface so no inter face */
public class Course implements Cloneable, Serializable,Comparable<Course> {
    //private Integer id ;
    private String name;
    private int  id;


    public Course(int id,String cName){
        super();
        this.id=id;
        this.name= cName;
    }

    public Course(int id) {
        super();
        this.id=id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String toString(){

        return "Course [id:"+ getId()+", Name:"+getName()+" ]";

    }


    //or customized sorting based on id
    @Override
    public int compareTo(Course o) {
        //subtract current id from the obj id
        return this.id - o.getId();
    }



    ///for customized sorting base on id of the cource obj
   /* @Override
        public int compareTo(Course o) {
        return this.id.compareTo(o.getId());
    }*/
}
