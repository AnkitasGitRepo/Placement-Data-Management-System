package com.practice.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.practice.spring.model.Stud;
import com.practice.spring.model.StudentData;
//import com.practice.spring.model.StudentData;


public interface StudentRepository extends JpaRepository<StudentData, Long>{

	StudentData findById(Integer id);

	//StudentData findbyId(Integer id);
}
