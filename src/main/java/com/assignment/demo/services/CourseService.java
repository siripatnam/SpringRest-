package com.assignment.demo.services;


import com.assignment.demo.models.Courses;
import com.assignment.demo.repositories.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CoursesRepository coursesRepository;

    public List<Courses> getAllCourses(){

        return coursesRepository.getAllCourses();
    }
}
