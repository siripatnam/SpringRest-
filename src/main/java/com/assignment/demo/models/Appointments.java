package com.assignment.demo.models;

public class Appointments {

    public int id;
    public String date;
    public String doctorName;
    public String speciality;

    public Appointments(int id, String date, String doctorName, String speciality) {
        this.id = id;
        this.date = date;
        this.doctorName = doctorName;
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
