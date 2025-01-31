package com.poll.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poll.app.entity.OptionEntity;

public interface OptionRepository extends JpaRepository<OptionEntity, Integer>{

}
