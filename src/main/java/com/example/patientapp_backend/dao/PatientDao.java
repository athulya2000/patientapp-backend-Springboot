package com.example.patientapp_backend.dao;

import com.example.patientapp_backend.model.Patients;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patients,Integer> {

    @Query(value="SELECT `id`, `contactno`, `dateofappointment`, `doctorname`, `patientid`, `patientname` FROM `patients` WHERE `patientid`=:patientid",nativeQuery = true)
    List<Patients> Searchpatients(@Param("patientid") String patientid);
     @Modifying
     @Transactional
    @Query(value="DELETE FROM `patients` WHERE `id`= :id",nativeQuery = true)
    void deletePatient(@Param("id") Integer id);
}
