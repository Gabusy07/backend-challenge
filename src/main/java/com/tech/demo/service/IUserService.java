package com.tech.demo.service;

import com.tech.demo.dto.UserResponse;
import com.tech.demo.dto.UserToRegister;
import reactor.core.publisher.Mono;

public interface IUserService {


    Mono<UserResponse> getUserById(String id);

    Mono<UserResponse> registerUser(UserToRegister userToRegister);



}
