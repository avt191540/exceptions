package pro.sky.exceptions;

import java.util.Objects;

public class Employee {
//    private static int counter = 0;
    protected String firstName;
    protected String lastName;
////    private final int id;
////    private int department;
////    private double salary;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
////        this.salary = salary;
////        id = counter;
////        counter++;
    }

////    public static int getCounter() {
////        return counter;
////    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
//
////    public void setDepartment(int department) {
////        this.department = department;
////    }
////
////    public double getSalary() {
////        return salary;
////    }
////
////    public void setSalary(double salary) {
////        this.salary = salary;
////    }
////
////    public int getId() {
////        return id;
////    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return lastName.equals(employee.lastName) && firstName.equals(employee.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
