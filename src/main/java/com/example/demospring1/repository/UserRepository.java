package com.example.demospring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demospring1.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

