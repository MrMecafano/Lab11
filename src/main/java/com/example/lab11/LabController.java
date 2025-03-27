package com.example.lab11;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lab")
public class LabController {

    @GetMapping("/home")
    public String home() {
        return "Welcome to the Lab 11 Home Page!";
    }

    @GetMapping("/about")
    public String about() {
        return "This is a Spring Boot application for Lab 11.";
    }

    @GetMapping("/contact")
    public String contact() {
        return "Contact us at: support@example.com";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/square/{num}")
    public int square(@PathVariable int num) {
        return num * num;
    }

    @GetMapping("/add/{x}/{y}")
    public int add(@PathVariable int x, @PathVariable int y) {
        return x + y;
    }

    @GetMapping("/calculate")
    public String calculate(
            @RequestParam int x,
            @RequestParam int y,
            @RequestParam String operation) {

        switch (operation.toLowerCase()) {
            case "add": return "Result: " + (x + y);
            case "subtract": return "Result: " + (x - y);
            case "multiply": return "Result: " + (x * y);
            case "divide": return (y != 0) ? "Result: " + ((double) x / y) : "Cannot divide by zero";
            default: return "Invalid operation!";
        }
    }
}
