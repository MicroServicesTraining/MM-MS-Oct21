/**
 * 
 */
package com.mm.sms.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.sms.dao.CourseDao;
import com.mm.sms.entity.Course;
import com.mm.sms.repository.CourseRepository;

/**
 * @author USER
 *
 */
@Component
public class CourseDaoImpl implements CourseDao {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

}
