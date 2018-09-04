package com.assignment.demo.repositories;

import com.assignment.demo.models.Doctor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DoctorRepository {

    public List<Doctor> getAllDoctors(){

        Doctor doctor = new Doctor(101,"Dr.Siri","Gynecology");
        Doctor doctor1 = new Doctor(102,"Dr.Nithin","cardiology");

        List<Doctor> doctorList = new ArrayList<>();
        doctorList.add(doctor);
        doctorList.add(doctor1);

        return doctorList;

    }
}
