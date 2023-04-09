package com.tech.demo.service;

import com.tech.demo.dto.UserResponse;
import com.tech.demo.dto.UserToRegister;
import reactor.core.publisher.Mono;

public interface IUserService {


    Mono<UserResponse> getUserById(String id);

    Mono<UserResponse> getUserByEmail(String email);

    Mono<UserResponse> registerUser(UserToRegister userToRegister);

    Mono<Void> deleteUserById(String id);
    Mono<UserResponse> updateUser(String id, UserToRegister userToRegister);


}
