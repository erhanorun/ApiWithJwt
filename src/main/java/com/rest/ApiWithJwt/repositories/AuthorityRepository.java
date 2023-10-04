package com.rest.ApiWithJwt.repositories;

import com.rest.ApiWithJwt.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
