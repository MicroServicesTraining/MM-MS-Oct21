/**
 * 
 */
package com.mm.sms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author USER
 *
 */
@Entity
@Table(name = "results")
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long result_id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rollno", referencedColumnName = "rollno")
	private Student student;
	
	@Column(name = "test1")
	private Integer test1Marks;
	
	@Column(name = "test2")
	private Integer test2Marks;
	
	@Column(name = "test3")
	private Integer test3Marks;
	
	@Column(name = "test4")
	private Integer test4Marks;

	/**
	 * @return the result_id
	 */
	public Long getResult_id() {
		return result_id;
	}

	/**
	 * @param result_id the result_id to set
	 */
	public void setResult_id(Long result_id) {
		this.result_id = result_id;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * @return the test1Marks
	 */
	public Integer getTest1Marks() {
		return test1Marks;
	}

	/**
	 * @param test1Marks the test1Marks to set
	 */
	public void setTest1Marks(Integer test1Marks) {
		this.test1Marks = test1Marks;
	}

	/**
	 * @return the test2Marks
	 */
	public Integer getTest2Marks() {
		return test2Marks;
	}

	/**
	 * @param test2Marks the test2Marks to set
	 */
	public void setTest2Marks(Integer test2Marks) {
		this.test2Marks = test2Marks;
	}

	/**
	 * @return the test3Marks
	 */
	public Integer getTest3Marks() {
		return test3Marks;
	}

	/**
	 * @param test3Marks the test3Marks to set
	 */
	public void setTest3Marks(Integer test3Marks) {
		this.test3Marks = test3Marks;
	}

	/**
	 * @return the test4Marks
	 */
	public Integer getTest4Marks() {
		return test4Marks;
	}

	/**
	 * @param test4Marks the test4Marks to set
	 */
	public void setTest4Marks(Integer test4Marks) {
		this.test4Marks = test4Marks;
	}
	
}
