/**
 * 
 */
package com.mm.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sms.entity.Course;
import com.mm.sms.service.CourseService;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("/api/v1/courses")
public class CoursesController {

	@Autowired
	private CourseService courseService;
	
	public List<Course> getAllCourses(){
		return courseService.getAllCourses();
	}
	
}
