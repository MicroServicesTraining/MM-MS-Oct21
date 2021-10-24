/**
 * 
 */
package com.mm.sms.ss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sms.ss.service.StudentsService;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/api/v1/students")
public class StudentsController {
	
	@Autowired
	public StudentsService studentsService;
		
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public List<String> getAllStudentsList(){
		return studentsService.getAllStudentsList();
	}
	
	@RequestMapping(path = "/{studentName}", method = RequestMethod.POST)
	public String createStudent(@PathVariable String studentName) throws Exception {
		return studentsService.createStudent(studentName);
	}

	@RequestMapping(path = "/{studentNameOld}/{studentNameNew}", method = RequestMethod.PUT)
	public String modifyStudent(@PathVariable String studentNameOld, @PathVariable String studentNameNew) {
		return studentsService.modifyStudent(studentNameOld, studentNameNew);
	}
	
	@RequestMapping(path = "/{studentName}", method = RequestMethod.DELETE)
	public Boolean deleteStudent(@PathVariable String studentName) {
		return studentsService.deleteStudent(studentName);
	}
}
