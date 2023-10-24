package com.devsuperior.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.userdept.entities.Department;

public interface DeptRepository extends JpaRepository<Department, Long>	{

}
