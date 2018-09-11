package com.javainuse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.data.SourceJpaRepository;
import com.javainuse.model.Source;

@RestController
@RequestMapping("/source")
public class SourceController {
	
	@Autowired
	private SourceJpaRepository sourceJpaRepository;
	
	@GetMapping(value = "/all")
	public List<Source> findAll(){
		return sourceJpaRepository.findAll();
	}
	
	@GetMapping(value = "/{name}")
	public Source findByName(@PathVariable final String name){
		return sourceJpaRepository.findByName(name);
		
	}
	
	@RequestMapping(value="/addNewUser", method= RequestMethod.POST)
	public Source addNewUser(@RequestBody final Source users){
		sourceJpaRepository.save(users);
		return sourceJpaRepository.findByName(users.getName());
	}

}
