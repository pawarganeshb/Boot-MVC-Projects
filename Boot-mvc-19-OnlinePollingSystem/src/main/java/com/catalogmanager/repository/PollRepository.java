package com.catalogmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalogmanager.entity.Poll;


@Repository
public interface PollRepository extends JpaRepository<Poll, Long> {
}