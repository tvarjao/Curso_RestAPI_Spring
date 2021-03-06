package com.example.eventmanagement.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.eventmanagement.controllers.exceptions.AlreadyCheckedInException;
import com.example.eventmanagement.entities.Participant;
import com.example.eventmanagement.repos.ParticipantRepository;

@RepositoryRestController
@RequestMapping("/events")
public class CheckinController {
	@Autowired
	private ParticipantRepository repository;

	@PostMapping("/checkin/{id}")
	public ResponseEntity<PersistentEntityResource> checkIn(@PathVariable Long id, PersistentEntityResourceAssembler assembler){
		
		Optional<Participant> participant = repository.findById(id);
		
		if(participant.isPresent()) {
			if(participant.get().getCheckedIn()) {
				throw new AlreadyCheckedInException();
			}
			participant.get().setCheckedIn(true);
			repository.save(participant.get());
		} else {
			throw new ResourceNotFoundException();
		}
		
		return ResponseEntity.ok(assembler.toResource(participant.get()));
	}
}
