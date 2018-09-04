package com.assignment.demo.controllers;

import com.assignment.demo.models.Appointments;
import com.assignment.demo.services.AppointmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentsController {

    @Autowired
    AppointmentsService appointmentsService;

    @RequestMapping(value = "/appointments")
    public List<Appointments> getAllAppointments(){

        return appointmentsService.getAllAppointments();

    }
}
