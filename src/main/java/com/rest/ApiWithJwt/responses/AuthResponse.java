package com.rest.ApiWithJwt.responses;

import lombok.Data;

@Data
public class AuthResponse {

    String message;
    Long userId;
    String accessToken;
}
