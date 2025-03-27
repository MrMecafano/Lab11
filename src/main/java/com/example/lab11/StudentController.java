package com.example.lab11;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/info")
    public String studentInfo() {
        return "Student Name: ME, Age: 20, Course: Math";
    }

    @GetMapping("/setAge/{age}")
    public String setAge(@PathVariable int age) {
        return "Student age updated to: " + age;
    }

    @GetMapping("/grade")
    public String studentGrade(@RequestParam String name, @RequestParam int marks) {
        String grade;
        if (marks >= 90) grade = "A";
        else if (marks >= 75) grade = "B";
        else if (marks >= 60) grade = "C";
        else grade = "F";
        return "Student " + name + " received grade: " + grade;
    }
}
