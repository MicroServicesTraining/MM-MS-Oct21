/**
 * 
 */
package com.mm.jpa.demo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mm.jpa.demo.model.Student;

/**
 * @author USER
 *
 */
public interface StudentsRepository extends JpaRepository<Student, Long> {

}
