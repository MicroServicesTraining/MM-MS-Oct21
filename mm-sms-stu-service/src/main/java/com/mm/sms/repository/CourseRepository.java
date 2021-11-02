/**
 * 
 */
package com.mm.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mm.sms.entity.Course;

/**
 * @author USER
 *
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
