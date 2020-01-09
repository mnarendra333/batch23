package com.pragim.springrestapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pragim.springrestapp.StudentRepository;
import com.pragim.springrestapp.model.Student;

@RestController
public class StudentController {

	// sprinjhg data

	@Autowired
	private StudentRepository repo;

	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getStuList() {
		return repo.findAll();
	}

	@PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> addStudent(@RequestBody Student student) {
		repo.save(student);
		Map<String, String> map = new HashMap<String, String>();
		map.put("msg", "student addedd successfully");
		return map;
	}
	
	@PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> updateStudent(@RequestBody Student student) {
		repo.save(student);
		Map<String, String> map = new HashMap<String, String>();
		map.put("msg", "student updated successfully");
		return map;
	}
	
	@GetMapping(value="/findstudent")
	public Optional<Student> getStudentInfo(@RequestParam("id") String sid){
		int stuId = Integer.parseInt(sid);
		Optional<Student> findById = repo.findById(stuId);
		return findById;
	}
	
	@DeleteMapping(path="/delete/{id}")
	public Map<String, String> deleteStudent(@PathVariable("id") String sid){
		int stuId = Integer.parseInt(sid);
		Student student = repo.findById(stuId).get();
		repo.delete(student);
		Map<String, String> map = new HashMap<String, String>();
		map.put("msg", "student deleted successfully");
		return map;
	}

}
