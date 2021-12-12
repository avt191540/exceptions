package pro.sky.exceptions.service;

import pro.sky.exceptions.Employee;

public interface EmployeeService {
    int numberEmployees();

    String addEmployee(String firstName, String lastName);

    String removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);
}
