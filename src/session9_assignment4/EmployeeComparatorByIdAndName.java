package session9_assignment4;

/*
 * This program helps to sort the employee details based on their salaries in ascending order by default.
 * In case, if they have same salary, then the sorting happens based on their names in alphabetical order, 
 * then by their designation.
 */

import java.util.Comparator;

public class EmployeeComparatorByIdAndName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int flag = o1.getId() - o2.getId();
        if(flag==0) flag = o1.getName().compareTo(o2.getName());
        return flag;
    }

}
// End of Method