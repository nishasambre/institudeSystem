package com.ISM.instituteSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ISM.instituteSystem.entity.Student;
import com.ISM.instituteSystem.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository sr;
	
	public List<Student> getAllStudent() {
		return sr.getAllStudent();
	}
	
	public String saveStudentDetails(Student student) {
		return sr.saveStudentDetails(student);
	}
	
	public String updateStudentDetails(Student student) {
		return sr.updateStudentDetails(student);
	}

	public String deleteStudent(Student student) {
		
		return sr.deleteStudent(student);
	}

	public Student getStudentById(int id) {
		return sr.getStudentById(id);
		
	}

	public String deleteStudentById(int id) {
		return sr.deleteStudentById(id);
		
	}

	public Student getByName(String name) {
		return sr.getByName(name);
		
	}
	
	public List<Student> getByCity(String city) {
		return sr.getByCity(city);
		
	}
	
	
}
