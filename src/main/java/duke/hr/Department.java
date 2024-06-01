/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.hr;

/**
 *
 * @author Luis
 */

public class Department {

    private String name;
    private Employee[] employees = new Employee[10];

    private int lastAddedEmployeeIndex = -1;

    public Department(){
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department: " + name;
    }

    public void addEmployee (Employee employee){
        if (lastAddedEmployeeIndex < employees.length) {
            lastAddedEmployeeIndex++;
            employees[lastAddedEmployeeIndex] = employee;
        }
    }
    
    public Employee[] getAllEmployees(){
        Employee[] actualEmployees = new Employee[lastAddedEmployeeIndex+1];
        for (int i = 0; i < actualEmployees.length; i++){
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }

    public Employee getEmployeeById(int id){
        for (Employee employee: employees
        ) {
            if (employee.getID() == id){
                return employee;
            }
    }
        return null;
    }

    public int getNumberOfEmployees(){
       return lastAddedEmployeeIndex+1;
    }

    public double getTotalSalary(){
       double total = 0.0;
        for (int i = 0; i <= lastAddedEmployeeIndex; i++){
            total += employees[i].getSalary();
        }
        return total;
    }

    public double getAverageSalary(){
        if (lastAddedEmployeeIndex > -1){
            return getTotalSalary() / (lastAddedEmployeeIndex+1);
        }
        return 0.0;
    }


}
