package com.example.lab11;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {

    @GetMapping("/details")
    public String courseDetails() {
        return "Course: Learning Web Programming, Duration: 6 weeks";
    }

    @GetMapping("/instructor")
    public String instructor() {
        return "Instructor: Dr Someone";
    }

    @GetMapping("/students")
    public String enrolledStudents() {
        return "Total students enrolled: 25";
    }
}
