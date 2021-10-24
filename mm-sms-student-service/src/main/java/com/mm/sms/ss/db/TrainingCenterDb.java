/**
 * 
 */
package com.mm.sms.ss.db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * @author USER
 *
 */
@Repository
public class TrainingCenterDb {
	
	private List<String> studentsList;	

	public TrainingCenterDb() {
		studentsList = new ArrayList<String>();
	}
	
	public List<String> select(){
		return studentsList;
	}
	
	public String insert(String studentName) {
		studentsList.add(studentName);
		return studentName;
	}
	
	public String update(String studentNameOld, String studentNameNew) {
		Iterator<String> it = studentsList.iterator();
		boolean studentNameOldFound = false;
		while(it.hasNext()) {
			String name = it.next();
			if(name.equals(studentNameOld)) {
				it.remove();
				studentNameOldFound = true;
			}
		}
		if(studentNameOldFound) {
			studentsList.add(studentNameNew);
		}
		return studentNameNew;
	}
	
	public Boolean delete( String studentName) {
		Iterator<String> it = studentsList.iterator();
		boolean studentNameOldFound = false;
		while(it.hasNext()) {
			String name = it.next();
			if(name.equals(studentName)) {
				it.remove();
				studentNameOldFound = true;
			}
		}
		return studentNameOldFound;
	}

}
