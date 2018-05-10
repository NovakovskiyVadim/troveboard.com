package com.troveboard.repository;

import com.troveboard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<User, String> {

    public User findByEmail(String email);
    public void deleteUserByEmail(String email);
}