package com.springrest.service;

import com.springrest.entities.Course;
import com.springrest.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {


    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getCourses(){
        return courseRepository.findAll();
    }

    public Course getCourseById(Long courseId) {
        return courseRepository.findById(courseId).get();
    }

    public Course updateCourse(Course course) {
        courseRepository.save(course);
        return course;
    }

    public Course addCourse(Course course) {

        courseRepository.save(course);
        return course;
    }

    public void deleteCourse(long courseId) {
        Course currentCourse=courseRepository.getReferenceById(courseId);
        courseRepository.delete(currentCourse);
    }
}
