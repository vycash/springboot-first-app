package com.springboot.app.springboot_first_app.controllers;
import org.springframework.web.bind.annotation.*;
import com.springboot.app.springboot_first_app.model.Employee;

@RestController
// now this class is able to handle HTTP Requests 
public class EmployeeController {

    // api url : http://localhost:8080/
    /**
     * 
     * @return a default Employee Object 
     */
    @GetMapping("/employee")
    public Employee getEmployee(){
        return new Employee("yahya", "software eng", 696085206,  "yahya@gmail.com");
    }
}
