/**
 * 
 */
package com.mm.jpa.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.jpa.demo.config.DemoConfig;
import com.mm.jpa.demo.model.Student;
import com.mm.jpa.demo.service.StudentsService;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/api/v1/student")
public class StudentsController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger("StudentsController");
	/*
	 * @Value("${mm.demo.message}") private String message;
	 * 
	 * @Value("${mm.demo.username:Ravi}") private String userName;
	 * 
	 * @Value("${mm.demo.maxlimit:25}") private Integer maxLimit;
	 */

	@Autowired
	private DemoConfig config;
	
	@Autowired
	private StudentsService studentsService;

	@GetMapping
	public List<Student> getAllStudents(){
		return studentsService.getAllStudents();
	}
	
	@GetMapping("/msg")
	public String getMessage() {
		LOGGER.info("Info Log");
		LOGGER.debug("Debug Log");
		LOGGER.error("Error LOG");
		LOGGER.trace("Tracing Log");
		LOGGER.warn("Warning Log");
		return "<h1>" + config.getMessage() + "</h1><h2>"+ config.getUserName() +"</h2><h3>"+ config.getMaxLimit() +"</h3>";
	}
	
}
