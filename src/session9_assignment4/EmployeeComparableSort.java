package session9_assignment4;

/*
 * This program helps to sort the employee details based on their salaries in ascending order by default.
 * In case, if they have same salary, then the sorting happens based on their names in alphabetical order, 
 * then by their designation.
 */

import java.util.Arrays;

public class EmployeeComparableSort {

    /**
     * This class shows how to sort custom objects array/list
     * implementing Comparable and Comparator interfaces
     * @param args
     */
    public static void main(String[] args) {

        //sorting custom object array
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Nivas", 23, 1000);
        empArr[1] = new Employee(20, "Arun", 24, 20000);
        empArr[2] = new Employee(5, "Sri", 35, 500);
        empArr[3] = new Employee(1, "Vikas", 28, 100000);
        
        //sorting employees array using Comparable interface implementation
        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Salary
        Arrays.sort(empArr, Employee.SalaryComparator);
        System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Age
        Arrays.sort(empArr, Employee.AgeComparator);
        System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Name
        Arrays.sort(empArr, Employee.NameComparator);
        System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));
        
        //Employees list sorted by ID and then name using Comparator class
        empArr[0] = new Employee(1, "Mikey", 25, 10000);
        Arrays.sort(empArr, new EmployeeComparatorByIdAndName());
        System.out.println("Employees list sorted by ID and Name:\n"+Arrays.toString(empArr));
    }

}
//End of Method