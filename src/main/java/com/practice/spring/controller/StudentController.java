package com.practice.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.practice.spring.model.Stud;
//import com.practice.spring.model.Stud;
import com.practice.spring.model.StudentData;
import com.practice.spring.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentrepository;
	
	
	@GetMapping("/studentdata")
	public  List<StudentData> studentdata() {
		return studentrepository.findAll();
		}
	
	@PostMapping("/student")
	public StudentData createStudentData(@RequestBody StudentData data) {
		return studentrepository.save(data);
	}
	

//	@PutMapping("data/id")
//	public ResponseEntity<StudentData> updateData(@PathVariable long id, @RequestBody StudentData studentdata  ) 
//	{
//		StudentData stud =StudentRepo;
//	}
	
	@RequestMapping("/delete/{id}")
	public String deleteStud(@PathVariable int id) {
		studentrepository.deleteById((long) id);
		return "Record Deleted";
	}
	
	@RequestMapping(path="Updated/{id}/{first_name}",method = RequestMethod.PUT)
	public String updateUser(@PathVariable Integer id , @PathVariable String first_name ) {
	 StudentData stud=studentrepository.findById(id);
	 //employee.setEmail(email);
	 stud.setFname(first_name);
	 studentrepository.save(stud);
	 return "Record Updated";
	}

}
