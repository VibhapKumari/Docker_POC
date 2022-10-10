package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepoStub {

    private static Map<Long, Employee> employees = new HashMap<>();
    private static Long index =2L;

    static{
        Employee emp1 = new Employee(1L,"Neha","Sharma","Neha@gmail.com");
        Employee emp2 = new Employee(2L,"Rohan","Verma","Rohan@gmail.com");
        employees.put(1L,emp1);
        employees.put(2L,emp2);
    }

    public  static List<Employee> findAll(){
        return new ArrayList<>(employees.values());
    }

    public  static Employee findById(Long employeeId){
        return employees.get(employeeId);
    }

    public static Employee save(Employee employee){
        index +=1;
        employee.setId(index);
        employees.put(index,employee);
        return  employee;
    }

    public  static Employee updateEmployee(Long id, Employee employee){
        employee.setId(id);
        employees.put(id,employee);
        return  employee;
    }

    public  static Employee delete(Long employeeId){
        return  employees.remove(employeeId);
    }
}

