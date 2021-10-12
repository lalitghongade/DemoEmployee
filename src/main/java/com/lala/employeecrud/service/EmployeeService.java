package com.lala.employeecrud.service;

import com.lala.employeecrud.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);

    Employee getEmployee(int employeeId);

    List<Employee> getAllEmpoyees();

    Employee updateEmployee(Employee employee);

   void deleteEmployee(int employeeId);
}
