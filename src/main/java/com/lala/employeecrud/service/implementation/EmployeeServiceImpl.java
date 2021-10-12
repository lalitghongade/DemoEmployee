package com.lala.employeecrud.service.implementation;

import com.lala.employeecrud.exception.EmployeeDetailsNotFound;
import com.lala.employeecrud.model.Employee;
import com.lala.employeecrud.repository.EmployeeRepository;
import com.lala.employeecrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(int employeeId) throws EmployeeDetailsNotFound {

        return employeeRepository.findById(employeeId)
                .orElseThrow(()-> new EmployeeDetailsNotFound("Not found"));
    }

    @Override
    public List<Employee> getAllEmpoyees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(int employeeId){
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(()-> new EmployeeDetailsNotFound("Not Found"));
        if(employee!=null)
            employeeRepository.deleteById(employeeId);

    }
}
