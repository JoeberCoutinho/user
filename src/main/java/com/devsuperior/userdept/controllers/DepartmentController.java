package com.devsuperior.userdept.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.Department;

import com.devsuperior.userdept.repositories.DeptRepository;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
	@Autowired//mecanismo de injeção de depencia
	private DeptRepository repository;
	@GetMapping//quando vc faz uma requisição web vc indica o tipo de requição get ou post ou find
	public List<Department> findAll(){
		List<Department> result = repository.findAll();
		return result;
		
	}
	@GetMapping(value = "/{id}")
	public Department findById(@PathVariable Long id){//
		Department result = repository.findById(id).get();
		return result;
		
	}
	@PostMapping
	public Department insert(@RequestBody Department dept){
		Department result = repository.save(dept);
		return result;
		
	}

}
