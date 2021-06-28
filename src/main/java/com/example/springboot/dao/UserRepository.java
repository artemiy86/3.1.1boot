package com.example.springboot.dao;

import com.example.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
 User findByUsername(String username);
}
