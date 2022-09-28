package com.karthik.collegeManagement.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "exams")
@DynamicUpdate
public class Exams implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "exam_id", nullable = false)
	private Integer examId;
	
	@Column(name = "exam_name", nullable = false)
	private String examName;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "conducted_date", nullable = false)
	private Date conductedDate;

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public Date getConductedDate() {
		return conductedDate;
	}

	public void setConductedDate(Date conductedDate) {
		this.conductedDate = conductedDate;
	}
}
