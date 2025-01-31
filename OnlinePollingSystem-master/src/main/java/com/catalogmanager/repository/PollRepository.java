package com.catalogmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogmanager.entity.Poll;


public interface PollRepository extends JpaRepository<Poll, Long> {
}