package pro.sky.exceptions.service;

import org.springframework.stereotype.Service;
import pro.sky.exceptions.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
//    public static Employee[] employees = new Employee[5];
    private Employee[] employees = new Employee[5];

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
        if (numberEmployees() == 0) {
            return "Массив сотрудников заполнен полностью";
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(firstName, lastName);
                break;
            }
        }
        return firstName + " " + lastName;
    }

//    public static void main(String[] args) {

        //Код для проверки написанных методов

//        Employee employee1 = new Employee("Иван", "Иванов");
//        Employee employee2 = new Employee("Константин", "Семенов");
//        Employee employee3 = new Employee("Сергей", "Петров");
//        Employee employee4 = new Employee("Михаил", "Мишустин");
//        Employee employee5 = new Employee("Александр", "Сидоров");
//        Employee employee6 = new Employee("Степан", "Медведев");
//
//        employees[0] = employee1;
//        employees[1] = employee2;
//        employees[2] = employee3;
//        employees[3] = employee4;
//        employees[4] = employee5;
//        employees[5] = employee6;

}
