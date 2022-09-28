package com.karthik.collegeManagement.model;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "shifts")
@DynamicUpdate
public class Shifts implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shift_id", nullable = false)
	private Integer shiftId;
	
	@Column(name = "shift_start", columnDefinition = "Time", nullable = false)
	private LocalTime shiftStart;
	
	@Column(name = "shift_end", columnDefinition = "Time", nullable = false)
	private LocalTime shiftEnd;

	public Integer getShiftId() {
		return shiftId;
	}

	public void setShiftId(Integer shiftId) {
		this.shiftId = shiftId;
	}

	public LocalTime getShiftStart() {
		return shiftStart;
	}

	public void setShiftStart(LocalTime shiftStart) {
		this.shiftStart = shiftStart;
	}

	public LocalTime getShiftEnd() {
		return shiftEnd;
	}

	public void setShiftEnd(LocalTime shiftEnd) {
		this.shiftEnd = shiftEnd;
	}
}
