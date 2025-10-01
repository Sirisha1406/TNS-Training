package com.tnsif.StudentKprit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.StudentKprit.entity.Student;

public interface StudentRepo extends JpaRepository <Student,Long>{

}
