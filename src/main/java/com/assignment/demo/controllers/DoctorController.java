package com.assignment.demo.controllers;


import com.assignment.demo.models.Doctor;
import com.assignment.demo.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @RequestMapping(value = "/doctors")
    public List<Doctor> getAllDoctors(){

        return doctorService.getAllDoctors();
    }
}
