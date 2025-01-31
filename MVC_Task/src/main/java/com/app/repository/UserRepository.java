package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.UserEntity;
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByEmailAndPassword(String email, String password);
}