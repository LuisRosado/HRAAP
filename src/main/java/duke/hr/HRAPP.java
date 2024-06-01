package duke.hr;

/**
 *
 * @author Luis
 */

public class HRAPP {
    public static void main(String[] args) {

    
        System.out.println("------------> HR App <-------------");

    
        Department department = new Department("Education Department");

        System.out.println(department);
        Employee employee1 = new Employee(101, "Ana", 1234.56);
        Employee employee2 = new Employee(102, "Luis", 1200.34);
        Employee employee3 = new Employee(103, "Ramon", 1122.33);

        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);

        department.getAllEmployees();
        System.out.println("Number of employees: " + department.getNumberOfEmployees());

        department.getEmployeeById(101);

        System.out.println("Total salary of the Department: " + department.getTotalSalary());

        System.out.println("Average salary of the Department: " + department.getAverageSalary());


    }
}

