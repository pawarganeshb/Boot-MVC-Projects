package com.catalogmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogmanager.entity.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {}