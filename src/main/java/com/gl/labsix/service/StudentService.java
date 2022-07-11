package com.gl.labsix.service;

import java.util.List;

import com.gl.labsix.entity.Student;

public interface StudentService {

	public List<Student> findAll();

	public Student findById(Integer theId);

	public void save(Student student);

	public  void delete(Student student);

}
