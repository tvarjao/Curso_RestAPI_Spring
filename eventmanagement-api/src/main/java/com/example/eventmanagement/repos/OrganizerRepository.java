package com.example.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends CrudRepository<Organizer, Long> {

}
