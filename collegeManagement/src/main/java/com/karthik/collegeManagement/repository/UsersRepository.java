package com.karthik.collegeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karthik.collegeManagement.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

}
