/**
 * 
 */
package com.mm.jpa.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.jpa.demo.dao.StudentsDao;
import com.mm.jpa.demo.dao.repository.StudentsRepository;
import com.mm.jpa.demo.model.Student;

/**
 * @author USER
 *
 */
@Component
public class StudentsDaoImpl implements StudentsDao {
	
	@Autowired
	private StudentsRepository studentsRepository;

	@Override
	public List<Student> getAllStudents() {
		return studentsRepository.findAll();
	}

}
