package com.poll.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poll.app.entity.PollEntity;

public interface PollRepository extends JpaRepository<PollEntity, Integer> {
}