package com.rest.ApiWithJwt.requests;

import lombok.Data;

@Data
public class UserRequest {

    String username;
    String password;
}
