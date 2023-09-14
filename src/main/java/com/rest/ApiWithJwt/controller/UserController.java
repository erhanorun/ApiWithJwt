package com.rest.ApiWithJwt.controller;

import com.rest.ApiWithJwt.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public String signUp() {
        return;
    }

    @PostMapping("/login")
    public String login() {
        return;
    }

    @GetMapping(value = "/{username}")
    public String readUser() {
        return;
    }

    @DeleteMapping(value = "/{username}")
    public String delete() {
        return;
    }

}
