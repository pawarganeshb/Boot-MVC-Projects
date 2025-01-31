package com.poll.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poll.app.entity.VoteEntity;

public interface VoteRepository extends JpaRepository<VoteEntity, Long> {
}
