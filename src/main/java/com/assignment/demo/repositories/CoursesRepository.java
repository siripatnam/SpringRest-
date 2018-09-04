package com.assignment.demo.repositories;

import com.assignment.demo.models.Courses;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CoursesRepository {

    public List<Courses> getAllCourses(){

        Courses courses = new Courses(101,"Java","core java");
        Courses courses1 = new Courses(102,"Advance Java","Spring");

        List<Courses> coursesList = new ArrayList<>();

        coursesList.add(courses);
        coursesList.add(courses1);

        return  coursesList;
    }
}
