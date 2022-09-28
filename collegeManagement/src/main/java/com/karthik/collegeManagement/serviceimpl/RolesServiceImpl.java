package com.karthik.collegeManagement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthik.collegeManagement.model.Roles;
import com.karthik.collegeManagement.repository.RolesRepository;
import com.karthik.collegeManagement.service.RolesService;

@Service
public class RolesServiceImpl implements RolesService {

	@Autowired
	private RolesRepository rolesRepository;

	@Override
	public List<Roles> fetchAllRoles() {
		List<Roles> allRoles = rolesRepository.fetchAllRoles();
		return allRoles;
	}

	@Override
	public Roles fetchRoleById(Integer roleId) {
		Roles allRoles = rolesRepository.fetchRoleById(roleId);
		return allRoles;
	}
}
