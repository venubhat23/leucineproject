package com.srimani7.projects.cms.controller;

import com.srimani7.projects.cms.dto.FacultyDto;
import com.srimani7.projects.cms.entity.Faculty;
import com.srimani7.projects.cms.repo.FacultyRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/faculty")
public class FacultyController {
    private final FacultyRepository facultyRepository;

    public FacultyController(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @GetMapping
    public ResponseEntity<?> getFaculty(Long id) {
        return ResponseEntity.ofNullable(facultyRepository.findAll());
    }

    @PostMapping()
    public ResponseEntity<?> addFaculty(@RequestBody FacultyDto facultyDto) {
        var faculty = new Faculty(facultyDto);
        return ResponseEntity.ofNullable(facultyRepository.save(faculty));
    }
}
