/**
 * 
 */
package com.mm.sms.ss.dao;

import java.util.List;

/**
 * @author USER
 *
 */
public interface StudentsDao {

	List<String> getAllStudentsList();

	String createStudent(String studentName);

	String modifyStudent(String studentNameOld, String studentNameNew);

	Boolean deleteStudent(String studentName);

}
