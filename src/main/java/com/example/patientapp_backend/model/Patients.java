package com.example.patientapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patients")
public class Patients {
    @Id
    @GeneratedValue
    private int id;
    private String patientname;
    private String patientid;
    private String contactno;
    private String dateofappointment;
    private String doctorname;

    public Patients() {
    }

    public Patients(int id, String patientname, String patientid, String contactno, String dateofappointment, String doctorname) {
        this.id = id;
        this.patientname = patientname;
        this.patientid = patientid;
        this.contactno = contactno;
        this.dateofappointment = dateofappointment;
        this.doctorname = doctorname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getDateofappointment() {
        return dateofappointment;
    }

    public void setDateofappointment(String dateofappointment) {
        this.dateofappointment = dateofappointment;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }
}
