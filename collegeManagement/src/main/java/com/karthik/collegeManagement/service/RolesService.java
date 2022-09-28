package com.karthik.collegeManagement.service;

import java.util.List;

import com.karthik.collegeManagement.model.Roles;

public interface RolesService {
	public List<Roles> fetchAllRoles();
	
	public Roles fetchRoleById(Integer roleId);
}
