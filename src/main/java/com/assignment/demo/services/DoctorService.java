package com.assignment.demo.services;


import com.assignment.demo.models.Doctor;
import com.assignment.demo.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors(){

        return doctorRepository.getAllDoctors();
    }
}
