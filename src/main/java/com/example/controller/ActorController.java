package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Actor;
import com.example.service.ActorService;

@RestController
public class ActorController {
	
	@Autowired
	private ActorService actorService;

	@GetMapping("/Actor")
	public List<Actor> getActors(){
		return actorService.findAll();
	}
}
