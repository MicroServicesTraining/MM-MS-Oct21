/**
 * 
 */
package com.mm.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.sms.dao.StudentDao;
import com.mm.sms.entity.Student;
import com.mm.sms.service.StudentService;

/**
 * @author USER
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getStudentsList() {
		return studentDao.getStudentsList();
	}

	@Override
	public Student getStudentByRollno(Long rollno) {
		return studentDao.getStudentByRollno(rollno);
	}

	@Override
	public Student addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	@Override
	public Student modifyStudent(Student student, Long rollno) {
		return studentDao.modifyStudent(student, rollno);
	}

	@Override
	public Student removeStudent(Long rollno) {
		return studentDao.removeStudent(rollno);
	}

	@Override
	public Student findByRollno(Long rollno) {
		return studentDao.findByRollno(rollno);
	}

	@Override
	public List<Student> findByName(String name) {
		return studentDao.findByName(name);
	}

	@Override
	public List<Student> findByFee(Double fee) {
		return studentDao.findByFee(fee);
	}


}
