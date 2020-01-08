package com.pragim.springrestapp;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pragim.springrestapp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
