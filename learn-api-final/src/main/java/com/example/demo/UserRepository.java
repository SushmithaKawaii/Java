package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dao.Username;

public interface UserRepository extends CrudRepository<Username, Integer> {

	
	
}
