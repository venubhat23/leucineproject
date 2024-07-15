package com.srimani7.projects.cms.repo;

import com.srimani7.projects.cms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
