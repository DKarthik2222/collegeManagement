package com.karthik.collegeManagement.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "department")
@DynamicUpdate
public class Department implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dep_id", nullable = false)
	private Integer depId;
	
	@Column(name = "dep_name", nullable = false)
	private String depName;
	
	@ManyToOne
	@JoinColumn(name = "dep_head", referencedColumnName = "user_id")
	private Users depHead;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "head_from")
	private Date headFrom;

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Users getDepHead() {
		return depHead;
	}

	public void setDepHead(Users depHead) {
		this.depHead = depHead;
	}

	public Date getHeadFrom() {
		return headFrom;
	}

	public void setHeadFrom(Date headFrom) {
		this.headFrom = headFrom;
	}
}
