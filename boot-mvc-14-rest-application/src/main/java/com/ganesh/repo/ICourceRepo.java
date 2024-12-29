package com.ganesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.entity.Course;

public interface ICourceRepo extends JpaRepository<Course, Integer> {

}
