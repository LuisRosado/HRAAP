package duke.hr;

/**
 *
 * @author Luis
 */

public class HRAPP {
    public static void main(String[] args) {

        // Print statement to say the application is starting.

        System.out.println("*********** HR App Starts ***********");

        // New Department.

        Department department = new Department("Education Department");

        // toString() of the Department.

        System.out.println(department);

        // Create a few Employees and add them to the Department.

        Employee employee1 = new Employee(101, "Ann", 1234.56);
        Employee employee2 = new Employee(102, "Bob", 1200.34);
        Employee employee3 = new Employee(103, "Ray", 1122.33);

        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);


        // Get Every Employee in the Department and print their information.

        department.getAllEmployees();
        System.out.println("Number of employees: " + department.getNumberOfEmployees());

        // Locate an Employee by their id. Call toString() to print the information about this Employee.

        department.getEmployeeById(101);

        // Print the total salary of the Department.

        System.out.println("Total salary of the Department: " + department.getTotalSalary());

        // Print the average salary of the Department.

        System.out.println("Average salary of the Department: " + department.getAverageSalary());


    }
}

