package com.tech.demo.controller;

import com.tech.demo.dto.UserResponse;
import com.tech.demo.dto.UserToRegister;
import com.tech.demo.exception.ResourceAlreadyExistsException;
import com.tech.demo.exception.ResourceNotFoundException;
import com.tech.demo.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
@CrossOrigin(origins="${client_url}", maxAge = 3600)
public class UserController {
    private final IUserService userService;




    @GetMapping("/{username}")
    public Mono<UserResponse> getUserById(@PathVariable String username) throws ResourceNotFoundException {
        return userService.getUserByUsername(username);
    }

    @PostMapping
    public Mono<Object> createUser(@RequestBody UserToRegister userToRegister) throws ResourceAlreadyExistsException {
        return userService.registerUser(userToRegister);
    }


}
