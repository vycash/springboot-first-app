package com.springboot.app.springboot_first_app.controllers;
import org.springframework.web.bind.annotation.*;
import com.springboot.app.springboot_first_app.model.Student;

@RestController
// now this class is able to handle HTTP Requests 
public class StudentController {

    // api url : http://localhost:8080/student
    /**
     * 
     * @return a default Student Object 
     */
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("yahya", "qach");
    }
}
