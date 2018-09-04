package com.assignment.demo.controllers;


import com.assignment.demo.models.Courses;
import com.assignment.demo.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursesController {

    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/courses")
    public List<Courses> getAllCourses(){

        return courseService.getAllCourses();

    }
}
