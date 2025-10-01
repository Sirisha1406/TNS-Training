package com.tnsif.StudentKprit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.StudentKprit.entity.Student;
import com.tnsif.StudentKprit.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	public StudentService sc;
	
	@PostMapping("/addStd")
	public Student addStudent(@RequestBody Student Std) {
		return sc.addStd(Std);
	}
	
	@GetMapping("/getStd")
	public List <Student> getStudent(){
		return sc.getStd();
	}
	
	@DeleteMapping("/deletesid/{sid}")
	public void deleteStudent(@PathVariable long sid) {
		sc.delete(sid);
	}
	
	@PutMapping("/updateStd")
	public Student updateStudent(@RequestBody Student Std) {
		return sc.updateStudent(Std);
	}
	

}
