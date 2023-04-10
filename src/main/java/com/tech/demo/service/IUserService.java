package com.tech.demo.service;

import com.tech.demo.dto.UserResponse;
import com.tech.demo.dto.UserToRegister;
import com.tech.demo.exception.ResourceAlreadyExistsException;
import com.tech.demo.exception.ResourceNotFoundException;
import reactor.core.publisher.Mono;

public interface IUserService {


    Mono<UserResponse> getUserByUsername(String username) throws ResourceNotFoundException;

    Mono<Object> registerUser(UserToRegister userToRegister) throws ResourceAlreadyExistsException;



}
