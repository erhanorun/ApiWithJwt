package com.rest.ApiWithJwt.repositories;

import com.rest.ApiWithJwt.models.ERole;
import com.rest.ApiWithJwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
