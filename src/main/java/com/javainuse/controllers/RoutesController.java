package com.javainuse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.data.RoutesJpaRepository;
import com.javainuse.model.Routes;

@RestController
@RequestMapping("/routes")
public class RoutesController {
	
	@Autowired
	private RoutesJpaRepository routesJpaRepository;
	
	@GetMapping(value = "/all")
	public List<Routes> findAll(){
		return routesJpaRepository.findAll();
	}
}
