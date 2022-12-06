package com.example.patientapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @PostMapping("/addpatient")
    public String PatientAdd(){
        return "Welcome to patient add page";
    }
    @GetMapping("/viewpatient")
    public String Patientview(){
        return "Welcome to patient view page";
    }
}
