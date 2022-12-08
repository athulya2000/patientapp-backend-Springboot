package com.example.patientapp_backend.controller;

import com.example.patientapp_backend.dao.PatientDao;
import com.example.patientapp_backend.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PatientController {
    @Autowired
    private PatientDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/addpatient",consumes = "application/json",produces = "application/json")
    public Map<String,String> PatientAdd(@RequestBody Patients p){
        System.out.println(p.getPatientname().toString());
        System.out.println(p.getPatientid().toString());
        System.out.println(p.getContactno().toString());
        System.out.println(p.getDateofappointment().toString());
        System.out.println(p.getDoctorname().toString());
        dao.save(p);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewpatient")
    public List<Patients> Patientview(){
        return (List<Patients>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
    public List<Patients> Search(@RequestBody Patients p){
        String patientid=p.getPatientid();
        System.out.println(patientid);
        return (List<Patients>) dao.Searchpatients(p.getPatientid());
    }
}
