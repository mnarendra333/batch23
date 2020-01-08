package com.pragim.springrestapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pragim.springrestapp.StudentRepository;
import com.pragim.springrestapp.model.Student;

@RestController
public class StudentController {
	
	
	
	//sprinjhg data
	
	
		@Autowired
		private StudentRepository repo;
	
	
		@GetMapping(value="/list",produces=MediaType.APPLICATION_JSON_VALUE)
		public List<Student> getStuList(){
			return repo.findAll();
		}

}
