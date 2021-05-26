package Practice.Collection;

import java.util.Comparator;

public class CompareByName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

      return
              o1.getEmpName().compareTo(o1.getEmpName());
    }
}
