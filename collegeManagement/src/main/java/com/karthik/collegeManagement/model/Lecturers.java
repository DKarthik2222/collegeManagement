package com.karthik.collegeManagement.model;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "lecturers")
@DynamicUpdate
public class Lecturers implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
	private Users userId;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "subject_id", referencedColumnName = "subject_id", nullable = false)
	private Subjects subjectId;
	
	@ManyToOne
	@JoinColumn(name = "shift_id", referencedColumnName = "shift_id", nullable = false)
	private Shifts shiftId;

	public Users getUserId() {
		return userId;
	}

	public void setUserId(Users userId) {
		this.userId = userId;
	}

	public Subjects getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Subjects subjectId) {
		this.subjectId = subjectId;
	}

	public Shifts getShiftId() {
		return shiftId;
	}

	public void setShiftId(Shifts shiftId) {
		this.shiftId = shiftId;
	}
}
