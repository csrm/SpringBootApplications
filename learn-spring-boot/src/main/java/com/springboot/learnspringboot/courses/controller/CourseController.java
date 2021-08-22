package com.springboot.learnspringboot.courses.controller;

import com.springboot.learnspringboot.courses.bean.Course;
import com.springboot.learnspringboot.courses.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    
    @Autowired
    private CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        //return Arrays.asList(new Course(1, "Learn Microservices", "Mrudula"));
        return courseRepository.findAll();
    }

    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable Long id) {
        // return new Course(1, "Learn Microservices", "Mrudula");
        Optional<Course> course = courseRepository.findById(id);
        if(course.isEmpty()) {
            throw new RuntimeException("Course not found with id: " + id);
        }
        return course.get();
    }

    @PostMapping("/courses")
    public String createCourse(@RequestBody Course course) {
        try {
            courseRepository.save(course);
        } catch(Exception e) {
            return e.getMessage();
        }
        return "Data saved in the repository";        
    }

    @PutMapping("/courses/{id}")
    public String updateCourse(@PathVariable long id, @RequestBody Course course) {
        try {
            courseRepository.save(course);
        } catch(Exception e) {
            return e.getMessage();
        }
        return "Data updated in the repository";        
    }

    @DeleteMapping("/courses/{id}")
    public String deleteCourse(@PathVariable long id) {
        try {
            courseRepository.deleteById(id);
        } catch(Exception e) {
            return e.getMessage();
        }
        return "Data deleted from the repository";        
    }
}