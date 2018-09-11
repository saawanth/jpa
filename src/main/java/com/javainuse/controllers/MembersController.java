package com.javainuse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.data.MembersJpaRepository;
import com.javainuse.model.Members;

@RestController
@RequestMapping("/members")
public class MembersController {
	
	@Autowired
	private MembersJpaRepository membersJpaRepository;
	
	@GetMapping(value = "/all")
	public List<Members> findAll(){
		return membersJpaRepository.findAll();
	}
	
	@GetMapping(value = "/{name}")
	public Members findByName(@PathVariable final String name){
		return membersJpaRepository.findByName(name);
		
	}
	
	@RequestMapping(value="/addNewUser", method= RequestMethod.POST)
	public Members addNewUser(@RequestBody final Members members){
		membersJpaRepository.save(members);
		return membersJpaRepository.findByName(members.getName());
	}

}
