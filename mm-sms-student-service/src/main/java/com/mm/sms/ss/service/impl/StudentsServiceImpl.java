/**
 * 
 */
package com.mm.sms.ss.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.mm.sms.ss.dao.StudentsDao;
import com.mm.sms.ss.service.StudentsService;

/**
 * @author USER
 *
 */
@Service
public class StudentsServiceImpl implements StudentsService {

	@Autowired
	private StudentsDao studentsDao;

	@Override
	public List<String> getAllStudentsList() {
		return studentsDao.getAllStudentsList();
	}

	@Override
	public String createStudent(String studentName) throws Exception{
		if(StringUtils.isEmpty(studentName)) {
			throw new Exception("Student Name can not be empty");
		}
		return studentsDao.createStudent(studentName);
	}

	@Override
	public String modifyStudent(String studentNameOld, String studentNameNew) {
		return studentsDao.modifyStudent(studentNameOld, studentNameNew);
	}

	@Override
	public Boolean deleteStudent(String studentName) {
		return studentsDao.deleteStudent(studentName);
	}

}
