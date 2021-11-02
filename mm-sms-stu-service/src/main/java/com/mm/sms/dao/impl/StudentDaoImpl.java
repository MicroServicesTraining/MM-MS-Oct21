/**
 * 
 */
package com.mm.sms.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.sms.dao.StudentDao;
import com.mm.sms.entity.Student;
import com.mm.sms.repository.StudentRepository;

/**
 * @author USER
 *
 */
@Component
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getStudentsList() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentByRollno(Long rollno) {
		Optional<Student> student= studentRepository.findById(rollno);
		if(student.isPresent()) {
			return student.get();
		}else {
			return new Student();
		}
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student modifyStudent(Student student, Long rollno) {
		Optional<Student> result= studentRepository.findById(rollno); // select * from students where rollno = ?
		if(result.isPresent()) {
			//Student dbStudent = result.get();
			//dbStudent = student;
			student.setRollno(rollno);
			return studentRepository.save(student);
		}else {
			return student;
		}
	}

	@Override
	public Student removeStudent(Long rollno) {
		Optional<Student> student= studentRepository.findById(rollno);
		Student deletingStudent = new Student();
		if(student.isPresent()) {
			Student st =  student.get();
			deletingStudent.setRollno(st.getRollno());
			deletingStudent.setName(st.getName());
			deletingStudent.setCourse(st.getCourse());
			deletingStudent.setFee(st.getFee());
			studentRepository.delete(st);
		}
		return deletingStudent;
	}

	@Override
	public Student findByRollno(Long rollno) {
		return studentRepository.findByRollno(rollno);
	}

	@Override
	public List<Student> findByName(String name) {
		return studentRepository.findByName(name);
	}

	@Override
	public List<Student> findByFee(Double fee) {
		return studentRepository.findByFee(fee); // findByXXX()
	}
	
}
