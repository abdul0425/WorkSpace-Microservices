package com.mehmed.ekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.ekart.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer>{

}
