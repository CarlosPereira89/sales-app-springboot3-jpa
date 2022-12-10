package com.caps.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caps.sales.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
