package com.gl.labsix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.labsix.entity.Student;
import com.gl.labsix.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentrepo;

	@Override
	public List<Student> findAll() {
		return studentrepo.findAll();
	}

	@Override
	public Student findById(Integer theId) {
		return studentrepo.findById(theId).get();
	}

	@Override
	public void save(Student student) {
		studentrepo.save(student);	
	}

	@Override
	public void delete(Student student) {
		studentrepo.delete(student);
		
	}

}
