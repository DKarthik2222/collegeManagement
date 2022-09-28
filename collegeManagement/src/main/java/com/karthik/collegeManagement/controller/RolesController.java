package com.karthik.collegeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.collegeManagement.model.Roles;
import com.karthik.collegeManagement.service.RolesService;

@RestController
@RequestMapping("/roles")
public class RolesController {
	@Autowired
	private RolesService rolesService;

	@RequestMapping(value = "/getAllRolesById/{roleId}", method = RequestMethod.GET)
	public Roles getRoleByRoleId(@PathVariable("roleId") Integer roleId) {
		return rolesService.fetchRoleById(roleId);
	}

	@GetMapping("/getAllRoles")
	public List<Roles> getAllStudents() {
		return rolesService.fetchAllRoles();
	}
}
