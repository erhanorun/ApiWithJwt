package com.rest.ApiWithJwt.responses;

import com.rest.ApiWithJwt.entities.User;
import lombok.Data;

@Data
public class UserResponse {

    Long id;
    String username;

    public UserResponse(User entity) {
        this.id = entity.getId();
        this.username = entity.getUsername();
    }
}
