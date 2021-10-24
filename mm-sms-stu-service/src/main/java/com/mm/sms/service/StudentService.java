/**
 * 
 */
package com.mm.sms.service;

import java.util.List;

import com.mm.sms.entity.Student;

/**
 * @author USER
 *
 */
public interface StudentService {
	List<Student> getStudentsList();

	Student getStudentByRollno(Long rollno);

	Student addStudent(Student student);

	Student modifyStudent(Student student, Long rollno);

	Student removeStudent(Long rollno);
}
