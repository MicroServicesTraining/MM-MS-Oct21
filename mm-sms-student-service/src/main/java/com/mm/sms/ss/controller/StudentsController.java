/**
 * 
 */
package com.mm.sms.ss.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/api/v1/students")
public class StudentsController {
	
	private List<String> studentsList;
	
	public StudentsController() {
		studentsList = new ArrayList<String>();
	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public List<String> getAllStudentsList(){
		//studentsList = Arrays.asList("Ravi", "Kiran", "Ramya", "Kavya");
		return studentsList;
	}
	
	@RequestMapping(path = "/{studentName}", method = RequestMethod.POST)
	public String createStudent(@PathVariable String studentName) {
		//studentsList = Arrays.asList("Ravi", "Kiran", "Ramya", "Kavya");
		studentsList.add(studentName);
		return studentName;
	}

	
	@RequestMapping(path = "/{studentNameOld}/{studentNameNew}", method = RequestMethod.PUT)
	public String modifyStudent(@PathVariable String studentNameOld, @PathVariable String studentNameNew) {
		Iterator<String> it = studentsList.iterator();
		boolean studentNameOldFound = false;
		while(it.hasNext()) {
			String name = it.next();
			if(name.equals(studentNameOld)) {
				it.remove();
				studentNameOldFound = true;
			}
		}
		if(studentNameOldFound) {
			studentsList.add(studentNameNew);
		}
		return studentNameNew;
	}
	
	@RequestMapping(path = "/{studentName}", method = RequestMethod.DELETE)
	public Boolean deleteStudent(@PathVariable String studentName) {
		Iterator<String> it = studentsList.iterator();
		boolean studentNameOldFound = false;
		while(it.hasNext()) {
			String name = it.next();
			if(name.equals(studentName)) {
				it.remove();
				studentNameOldFound = true;
			}
		}
		return studentNameOldFound;
	}
}
