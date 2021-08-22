package com.springboot.learnspringboot.courses.repository;

import com.springboot.learnspringboot.courses.bean.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
    
}
