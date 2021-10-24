/**
 * 
 */
package com.mm.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mm.sms.entity.Student;

/**
 * @author USER
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
