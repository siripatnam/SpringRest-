package com.assignment.demo.services;


import com.assignment.demo.models.Appointments;
import com.assignment.demo.repositories.AppointmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentsService {

    @Autowired
    AppointmentsRepository appointmentsRepository;

        public List<Appointments> getAllAppointments(){

            return appointmentsRepository.getAllAppointments();
        }
}
