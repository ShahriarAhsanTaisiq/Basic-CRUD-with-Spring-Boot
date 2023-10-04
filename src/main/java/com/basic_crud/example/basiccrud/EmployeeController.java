package com.basic_crud.example.basiccrud;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return Service.getAllEmployees();
    }
    @GetMapping("/employee/{employeeId}")
    public Employee getEmployeeDetails(@PathVariable Long employeeId){
        return Service.getEmployeeDetails(employeeId);

    }
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return Service.addEmployee(employee);
    }
    @GetMapping("/updateEmployee/{employeeId}")
    public Employee updateEmployee(@PathVariable Long employeeId, @RequestBody Employee employee){
        return Service.updateEmployee(employeeId,employee);
    }
    @DeleteMapping("/deleteEmployee/{employeeId}")
    public Employee deleteEmployee(@PathVariable Long employeeId){
        return Service.deleteEmployee(employeeId);
    }


}
