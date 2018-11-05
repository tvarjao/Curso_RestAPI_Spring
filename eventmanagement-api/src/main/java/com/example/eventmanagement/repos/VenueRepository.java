package com.example.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.eventmanagement.entities.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}
