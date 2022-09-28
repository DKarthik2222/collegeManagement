package com.karthik.collegeManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.karthik.collegeManagement.model.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {

	@Query(value = "select * from roles", nativeQuery = true)
	public List<Roles> fetchAllRoles();

	@Query(value = "select * from roles where role_id=:roleId", nativeQuery = true)
	public Roles fetchRoleById(@Param("roleId") Integer roleId);
}
