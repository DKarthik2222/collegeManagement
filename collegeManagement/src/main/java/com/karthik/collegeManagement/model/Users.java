package com.karthik.collegeManagement.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "users")
@DynamicUpdate
public class Users implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", nullable = false)
	private Integer userId;
	
	@ManyToOne
	@JoinColumn(name = "role_id", referencedColumnName = "role_id", nullable = false)
	private Roles roleId;
	
	@Column(name = "user_name", nullable = false)
	private String userName;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "birth_date", nullable = false)
	private Date birthDate;
	
	@Column(name = "gender", nullable = false)
	private Character gender;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "phone", nullable = false)
	private String phone;
	
	@ManyToOne
	@JoinColumn(name = "dep_id", referencedColumnName = "dep_id")
	private Department depId;
	
	@ManyToOne
	@JoinColumn(name = "college_id", referencedColumnName = "college_id")
	private Colleges collegeId;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "joined_date", nullable = false)
	private Date joinedDate;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Roles getRoleId() {
		return roleId;
	}

	public void setRoleId(Roles roleId) {
		this.roleId = roleId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Department getDepId() {
		return depId;
	}

	public void setDepId(Department depId) {
		this.depId = depId;
	}

	public Colleges getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Colleges collegeId) {
		this.collegeId = collegeId;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
