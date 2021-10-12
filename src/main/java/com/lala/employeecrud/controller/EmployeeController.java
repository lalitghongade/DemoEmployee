package com.lala.employeecrud.controller;

import com.lala.employeecrud.model.Employee;
import com.lala.employeecrud.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Operation(summary = "Adds A Employee")
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @Operation(summary = "Gets Employee By Id")
    @GetMapping("employee/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        return employeeService.getEmployee(employeeId);
    }

    @Operation(summary = "Get All Employees List")
    @GetMapping("/employees")
    public List<Employee> getAllEmpoyees() {
        return employeeService.getAllEmpoyees();
    }

    @Operation(summary = "Updates A Employee")
    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @Operation(summary = "Deletes A Employee by Id")
    @DeleteMapping("employee/{employeeId}")
    public void deleteEmployee(@PathVariable int employeeId) {
         employeeService.deleteEmployee(employeeId);
    }
}
