package com.example.patientapp_backend.controller;

import com.example.patientapp_backend.dao.PatientDao;
import com.example.patientapp_backend.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/addpatient",consumes = "application/json",produces = "application/json")
    public String PatientAdd(@RequestBody Patients p){
        System.out.println(p.getPatientname().toString());
        System.out.println(p.getPatientid().toString());
        System.out.println(p.getContactno().toString());
        System.out.println(p.getDateofappointment().toString());
        System.out.println(p.getDoctorname().toString());
        dao.save(p);
        return "Welcome to patient add page";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewpatient")
    public List<Patients> Patientview(){
        return (List<Patients>) dao.findAll();
    }
}
