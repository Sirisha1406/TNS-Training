package com.tnsif.StudentKprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.StudentKprit.entity.Student;
import com.tnsif.StudentKprit.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	public StudentRepo sr;
	
	//insert
	public Student addStd(Student Std) {
		return sr.save(Std);
	}
	
	//get
	public List <Student> getStd(){
		return sr.findAll();
	}
	
	//delete
	public void delete(long sid) {
		sr.deleteById(sid);
	}
	
	//update
		//update Student set sdept="HOD" where Sid=11;
	public Student updateStudent(Student Std) {
		long sid=Std.getSid();
		//getSid-->userinput
		//findbyid-->db input
		Student Std1=sr.findById(sid).get();
		Std1.setSname(Std.getSname());
		Std1.setCollegename(Std.getCollegename());
		Std1.setSroll(Std.getSroll());
		Std1.setQualification(Std.getQualification());
		Std1.setCourse(Std.getCourse());
		Std.setYear(Std.getYear());
		return sr.save(Std1);
	}

}
