package com.rest.ApiWithJwt.repositories;

import com.rest.ApiWithJwt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
