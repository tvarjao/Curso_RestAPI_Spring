package com.example.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.eventmanagement.entities.Event;

public interface ParticipantRepository extends PagingAndSortingRepository<Event, Long> {

}
