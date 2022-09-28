package com.karthik.collegeManagement.model;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "marks")
@DynamicUpdate
public class Marks implements Serializable{
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
	@JoinColumn(name = "exam_id", referencedColumnName = "exam_id", nullable = false)
	private Exams examId;
	
	@Column(name = "marks", nullable = false)
	private Integer marks;

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

	public Exams getExamId() {
		return examId;
	}

	public void setExamId(Exams examId) {
		this.examId = examId;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}
}
