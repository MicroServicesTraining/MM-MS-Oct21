/**
 * 
 */
package com.mm.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mm.sms.entity.Student;

/**
 * @author USER
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	public List<Student> findByName(String name);
	public Student findByRollno(Long rollno);
	public List<Student> findByFee(Double fee);
}
