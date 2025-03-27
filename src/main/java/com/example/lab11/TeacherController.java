package com.example.lab11;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @GetMapping("/info")
    public String teacherInfo() {
        return "Teacher Name: Mr. Someone, Subject:Math";
    }

    @GetMapping("/experience")
    public String experience() {
        return "Teaching experience: 11years";
    }

    @GetMapping("/department")
    public String department() {
        return "Department: Computer Science";
    }
}
