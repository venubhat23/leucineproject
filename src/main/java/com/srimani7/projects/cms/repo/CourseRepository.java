package com.srimani7.projects.cms.repo;

import com.srimani7.projects.cms.entity.Course;
import com.srimani7.projects.cms.projection.AdmissionCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query("select c.id as id, c.name as name from Course c")
    Optional<List<AdmissionCourse>> getAdmissionsCourses();
}
