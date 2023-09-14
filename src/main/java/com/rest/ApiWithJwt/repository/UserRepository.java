package com.rest.ApiWithJwt.repository;

import com.rest.ApiWithJwt.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long> {
}
