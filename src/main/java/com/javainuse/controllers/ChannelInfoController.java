package com.javainuse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.data.ChannelInfoJpaRepository;
import com.javainuse.model.ChannelInfo;

@RestController
@RequestMapping("/channelInfo")
public class ChannelInfoController {
	
	@Autowired
	private ChannelInfoJpaRepository channelInfoJpaRepository;
	
	@GetMapping(value = "/all")
	public List<ChannelInfo> findAll(){
		return channelInfoJpaRepository.findAll();
	}
}
