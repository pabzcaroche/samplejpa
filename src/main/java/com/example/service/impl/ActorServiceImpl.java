package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Actor;
import com.example.repository.ActorRepository;
import com.example.service.ActorService;

@Service
public class ActorServiceImpl implements ActorService{
	
	@Autowired
	private ActorRepository actorRepository;

	@Override
	public List<Actor> findAll() {
		return actorRepository.findAll();
	}

}
