package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> students;
	
	// define @PostContruct to load  the student data... only once! 
	@PostConstruct
	public void loadData() {
		students = new ArrayList<>();
		students.add(new Student("Yordan", "Campos"));
		students.add(new Student("Pamela", "Vega"));
		students.add(new Student("Daniela", "Mora"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return students;
	}
	
	// define endpoint for retrieve a single student
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		// Exception handling
		if((studentId >= students.size()) || (studentId<0))
			throw new StudentNotFoundException("Student id not found - " + studentId);
		
		return students.get(studentId);
	}
}
