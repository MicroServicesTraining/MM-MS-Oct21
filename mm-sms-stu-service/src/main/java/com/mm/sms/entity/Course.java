/**
 * 
 */
package com.mm.sms.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author USER
 *
 */
@Entity
@Table(name = "course")
public class Course {

	@Id
	@Column(name = "course_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long coruseId;
	
	private String name;
	private Integer duration;
	private Double fee;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id", referencedColumnName = "course_id")
	private List<Student> students;
	
	@ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
	private Set<Subject> subjects;

	/**
	 * @return the coruseId
	 */
	public Long getCoruseId() {
		return coruseId;
	}

	/**
	 * @param coruseId the coruseId to set
	 */
	public void setCoruseId(Long coruseId) {
		this.coruseId = coruseId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the duration
	 */
	public Integer getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	/**
	 * @return the fee
	 */
	public Double getFee() {
		return fee;
	}

	/**
	 * @param fee the fee to set
	 */
	public void setFee(Double fee) {
		this.fee = fee;
	}

	/**
	 * @return the students
	 */
	/*
	 * public List<Student> getStudents() { return students; }
	 */

	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	/**
	 * @return the subjects
	 */
	public Set<Subject> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
	
}
