package com.srimani7.projects.cms.controller;

import com.srimani7.projects.cms.dto.CourseDto;
import com.srimani7.projects.cms.entity.Course;
import com.srimani7.projects.cms.repo.CourseRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/courses")
public class CourseController {
    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody CourseDto dto) {
        var course = new Course();
        course.setName(dto.getName());
        course.setDescription(dto.getDescription());
        var sCourse = courseRepository.save(course);
        return ResponseEntity.ofNullable(sCourse);
    }

    @GetMapping
    public ResponseEntity<List<Course>> getCourses() {
        return ResponseEntity.ofNullable(courseRepository.findAll());
    }
}
