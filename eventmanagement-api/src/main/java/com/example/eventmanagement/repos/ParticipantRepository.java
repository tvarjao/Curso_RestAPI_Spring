package com.example.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.eventmanagement.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}
