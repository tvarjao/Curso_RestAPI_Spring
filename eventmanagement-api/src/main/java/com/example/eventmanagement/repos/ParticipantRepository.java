package com.example.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.eventmanagement.entities.Event;

public interface ParticipantRepository extends CrudRepository<Event, Long> {

}
