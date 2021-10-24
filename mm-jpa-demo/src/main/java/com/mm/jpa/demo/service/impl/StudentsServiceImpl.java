/**
 * 
 */
package com.mm.jpa.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.jpa.demo.dao.StudentsDao;
import com.mm.jpa.demo.model.Student;
import com.mm.jpa.demo.service.StudentsService;

/**
 * @author USER
 *
 */
@Service
public class StudentsServiceImpl implements StudentsService {

	@Autowired
	private StudentsDao studentsDao;

	@Override
	public List<Student> getAllStudents() {
		return studentsDao.getAllStudents();
	}

}
