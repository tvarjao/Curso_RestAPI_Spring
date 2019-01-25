package com.example.eventmanagement.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.eventmanagement.entities.Event;
import com.example.eventmanagement.repos.EventRepository;

@RepositoryRestController
@RequestMapping("/events")
public class EventKickOffController {
	
	@Autowired
	private EventRepository repository;
	
	@PostMapping("/start/{id}")
	public ResponseEntity<?> start(@PathVariable Long id) {
		
		Optional<Event> event = repository.findById(id);
		
		if(!event.isPresent()) {
			throw new ResourceNotFoundException();
		}
		
		event.get().setStarted(true);
		repository.save(event.get());
		
		return ResponseEntity.ok(event.get().getName()+" has started");
	}
}
