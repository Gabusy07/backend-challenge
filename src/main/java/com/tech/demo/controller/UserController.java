package com.tech.demo.controller;

import com.tech.demo.document.User;
import com.tech.demo.dto.UserRequest;
import com.tech.demo.dto.UserResponse;
import com.tech.demo.dto.UserToRegister;
import com.tech.demo.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final IUserService userService;




    @GetMapping("/{id}")
    public Mono<UserResponse> getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public Mono<UserResponse> createUser(@RequestBody UserToRegister userToRegister) {
        return userService.registerUser(userToRegister);
    }


}
