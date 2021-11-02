/**
 * 
 */
package com.mm.sms.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author USER
 *
 */
@Entity
@Table(name = "subject")
public class Subject {

	@Id
	@Column(name = "subject_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long subjectId;
	
	@Column(name = "name")
	private String name;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "course_subject",
		joinColumns = {
			@JoinColumn(name = "subject_id", referencedColumnName = "subject_id", nullable = false)	
		},
		inverseJoinColumns = {
				@JoinColumn(name = "courser_id", referencedColumnName = "course_id", nullable = false)
		})
	private Set<Course> courses;

	/**
	 * @return the subjectId
	 */
	public Long getSubjectId() {
		return subjectId;
	}

	/**
	 * @param subjectId the subjectId to set
	 */
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
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
		
}
