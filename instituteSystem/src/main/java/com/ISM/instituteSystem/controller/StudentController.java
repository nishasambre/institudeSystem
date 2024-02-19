package com.ISM.instituteSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ISM.instituteSystem.entity.Student;
import com.ISM.instituteSystem.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService ss;
	
	@GetMapping("all")
	public List<Student> getAllStudent() {
		return ss.getAllStudent();
	}
	
	@PostMapping("/save")
	public String saveStudentDetails(@RequestBody Student student) {
		return ss.saveStudentDetails(student);
	}
	
	@PutMapping("/update")
	public String updateStudentDetails(@RequestBody Student student) {
		return ss.updateStudentDetails(student);
	}
	
	@DeleteMapping("/delete")
	public String deleteStudent(@RequestBody Student student) {
		return ss.deleteStudent(student);
	}
	
	@GetMapping("/Id/{id}")
	public Student getStudentById(@PathVariable int id ) {
	return  ss.getStudentById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudentById(@PathVariable int id) {
		return ss.deleteStudentById(id);
	}
	
	@GetMapping("/Name/{name}")
	public Student getByName(@PathVariable String name) {
		return ss.getByName(name);
	}
	
	@GetMapping("/City/{city}")
	public List<Student> getByCity(@PathVariable String city) {
		return ss.getByCity(city);
	}
	
}
