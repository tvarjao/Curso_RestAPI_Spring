package com.example.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.eventmanagement.entities.Participant;

public interface EventRepository extends CrudRepository<Participant, Long> {

}
