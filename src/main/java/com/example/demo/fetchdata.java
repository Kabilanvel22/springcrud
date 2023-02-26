package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface fetchdata extends JpaRepository<demo,Integer>{

	@Override
	List<demo>findAll();
	
}
