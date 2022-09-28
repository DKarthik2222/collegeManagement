package com.karthik.collegeManagement.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "complaints")
@DynamicUpdate
public class Complaints implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "complaint_id", nullable = false)
	private Integer complaintId;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
	private Users userId;
	
	@Column(name = "complaint", nullable = false)
	private String complaint;
	
	@ManyToOne
	@JoinColumn(name = "complaint_dep", referencedColumnName = "dep_id", nullable = false)
	private Department complaintDep;
	
	@Column(name = "complaint_active", nullable = false, columnDefinition = "TINYINT", length = 1)
	private Boolean complaintActive;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "raised_on", nullable = false)
	private Date raisedOn;

	public Integer getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(Integer complaintId) {
		this.complaintId = complaintId;
	}

	public Users getUserId() {
		return userId;
	}

	public void setUserId(Users userId) {
		this.userId = userId;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public Department getComplaintDep() {
		return complaintDep;
	}

	public void setComplaintDep(Department complaintDep) {
		this.complaintDep = complaintDep;
	}

	public Boolean getComplaintActive() {
		return complaintActive;
	}

	public void setComplaintActive(Boolean complaintActive) {
		this.complaintActive = complaintActive;
	}

	public Date getRaisedOn() {
		return raisedOn;
	}

	public void setRaisedOn(Date raisedOn) {
		this.raisedOn = raisedOn;
	}
}
