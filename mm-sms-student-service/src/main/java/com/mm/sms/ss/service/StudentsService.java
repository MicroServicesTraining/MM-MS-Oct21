/**
 * 
 */
package com.mm.sms.ss.service;

import java.util.List;

/**
 * @author USER
 *
 */
public interface StudentsService {

	List<String> getAllStudentsList();

	String createStudent(String studentName) throws Exception;

	String modifyStudent(String studentNameOld, String studentNameNew);

	Boolean deleteStudent(String studentName);

}
