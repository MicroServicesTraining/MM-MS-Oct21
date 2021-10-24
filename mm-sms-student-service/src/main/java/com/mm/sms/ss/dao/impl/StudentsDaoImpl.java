/**
 * 
 */
package com.mm.sms.ss.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.sms.ss.dao.StudentsDao;
import com.mm.sms.ss.db.TrainingCenterDb;

/**
 * @author USER
 *
 */
@Component
public class StudentsDaoImpl implements StudentsDao {
	
	@Autowired
	private TrainingCenterDb db;

	@Override
	public List<String> getAllStudentsList() {
		return db.select();
	}

	@Override
	public String createStudent(String studentName) {
		return db.insert(studentName);
	}

	@Override
	public String modifyStudent(String studentNameOld, String studentNameNew) {
		return db.update(studentNameOld, studentNameNew);
	}

	@Override
	public Boolean deleteStudent(String studentName) {
		return db.delete(studentName);
	}

}
