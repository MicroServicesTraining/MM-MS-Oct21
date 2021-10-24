/**
 * 
 */
package com.mm.jpa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.jpa.demo.model.Student;
import com.mm.jpa.demo.service.StudentsService;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/api/v1/student")
public class StudentsController {

	@Autowired
	private StudentsService studentsService;

	@GetMapping
	public List<Student> getAllStudents(){
		return studentsService.getAllStudents();
	}
	
}
