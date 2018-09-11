package com.javainuse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.data.DestinationJpaRepository;
import com.javainuse.model.Destination;

@RestController
@RequestMapping("/destination")
public class DestinationController {
	
	@Autowired
	private DestinationJpaRepository destinationJpaRepository;
	
	@GetMapping(value = "/all")
	public List<Destination> findAll(){
		return destinationJpaRepository.findAll();
	}
	
	@GetMapping(value = "/{name}")
	public Destination findByName(@PathVariable final String name){
		return destinationJpaRepository.findByName(name);
	}
	
	@RequestMapping(value="/addNewUser", method= RequestMethod.POST)
	public Destination addNewUser(@RequestBody final Destination users){
		destinationJpaRepository.save(users);
		return destinationJpaRepository.findByName(users.getName());
	}

}
