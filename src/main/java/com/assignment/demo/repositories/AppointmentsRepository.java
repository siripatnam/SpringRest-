package com.assignment.demo.repositories;


import com.assignment.demo.models.Appointments;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AppointmentsRepository {

    public List<Appointments> getAllAppointments(){

        List<Appointments> appointmentsList = new ArrayList<>();

        Appointments appointments = new Appointments(101,"Sept52018","Dr.Siri","cardiology");
        Appointments appointments1 = new Appointments(102,"Sept62018","Dr.Nithin","Neurology");

        appointmentsList.add(appointments);
        appointmentsList.add(appointments1);

        return appointmentsList;

    }


}
