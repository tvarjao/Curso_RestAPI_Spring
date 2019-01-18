package com.example.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.eventmanagement.entities.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

}
