package com.catalogmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalogmanager.entity.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {}