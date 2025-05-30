package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	// http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Ramesh","Suresh");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ramesh", "Kumar"));
		students.add(new Student("Tony", "Kakkar"));
		students.add(new Student("Ram", "Singh"));
		students.add(new Student("Monu", "Thakur"));
		students.add(new Student("Rahul", "Pandit"));
		return students;
	}
}
