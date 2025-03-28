package com.bridgelabz.mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class EmployeeGrouping {
    public static void main(String[] args) {
        // Example list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));

        // Grouping employees by department
        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        // Printing the result
        for (String department : groupedEmployees.keySet()) {
            System.out.println(department + ": " + groupedEmployees.get(department));
        }
    }

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee employee : employees) {
            departmentMap.putIfAbsent(employee.department, new ArrayList<>());
            departmentMap.get(employee.department).add(employee);
        }

        return departmentMap;
    }
}
