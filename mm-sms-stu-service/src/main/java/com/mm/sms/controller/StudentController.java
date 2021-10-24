/**
 * 
 */
package com.mm.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sms.entity.Student;
import com.mm.sms.service.StudentService;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping
	public List<Student> getStudentsList(){
		return studentService.getStudentsList();
	}
	
	@GetMapping("/rollno/{rollno}")
	public Student getStudentByRollno(@PathVariable Long rollno) {
		return studentService.getStudentByRollno(rollno);
	}
	
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@PutMapping("/rollno/{rollno}")
	public Student modifyStudent(@RequestBody Student student, @PathVariable Long rollno) {
		return studentService.modifyStudent(student, rollno);
	}
	
	@DeleteMapping("/rollno/{rollno}")
	public Student removeStudent(@PathVariable Long rollno) {
		return studentService.removeStudent(rollno);
	}
	
}
