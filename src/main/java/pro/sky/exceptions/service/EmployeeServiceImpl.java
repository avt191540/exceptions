package pro.sky.exceptions.service;

import org.springframework.stereotype.Service;
import pro.sky.exceptions.Employee;
import pro.sky.exceptions.NotFoundException;
import pro.sky.exceptions.OverflowArrayException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private Employee[] employees = new Employee[2];

@Override
    public int numberEmployees() {
        int numberEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                numberEmployees++;
            }
        }
        return numberEmployees;
    }
@Override
    public String addEmployee(String firstName, String lastName) {
        if (numberEmployees() == employees.length) {
            throw new OverflowArrayException();
        }
        int i = 0;
        for (; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(firstName, lastName);
                break;
            }
        }
        return (employees[i].toString());
    }
@Override
    public String removeEmployee(String firstName, String lastName) {
        if (numberEmployees() == 0) {
            throw new NotFoundException();
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFirstName().equals(firstName) && employees[i].getLastName().equals(lastName)) {
                employees[i] = null;
                return (firstName + " " + lastName);
            }
        }
        throw new NotFoundException();
    }
@Override
    public Employee findEmployee(String firstName, String lastName) {
        if (numberEmployees() == 0) {
            throw new NotFoundException();
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFirstName().equals(firstName) && employees[i].getLastName().equals(lastName)) {
                return (employees[i]);
            }
        }
        throw new NotFoundException();
    }
}
