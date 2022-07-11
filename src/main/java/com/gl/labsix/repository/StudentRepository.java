package com.gl.labsix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.labsix.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
