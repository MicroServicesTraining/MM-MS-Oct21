/**
 * 
 */
package com.mm.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.sms.dao.CourseDao;
import com.mm.sms.dao.impl.CourseDaoImpl;
import com.mm.sms.entity.Course;
import com.mm.sms.service.CourseService;

/**
 * @author USER
 *
 */
@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getAllCourses() {
		return courseDao.getAllCourses();
	}

}
