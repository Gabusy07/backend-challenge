package com.tech.demo.service;

import com.tech.demo.document.User;
import com.tech.demo.dto.UserResponse;
import com.tech.demo.dto.UserToRegister;

import com.tech.demo.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;


    @Override
    public Mono<UserResponse> getUserById(String id) {
        return userRepository.findById(id)
                .map(user -> UserResponse.builder()
                        .id(user.getId())
                        .email(user.getEmail())
                        .name(user.getName())
                        .lastname(user.getLastname())
                        .token("").build()
                );
    }


    @Override
    public Mono<UserResponse> registerUser(UserToRegister userToRegister) {
        User user = User.builder()
                .name(userToRegister.getName())
                .lastname(userToRegister.getLastname())
                .documentType(userToRegister.getDocumentType())
                .document(userToRegister.getDocument())
                .email(userToRegister.getEmail())
                .password(userToRegister.getPassword())
                .build();
        return userRepository.save(user)
                .map(u -> UserResponse.builder()
                        .id(u.getId())
                        .email(u.getEmail())
                        .name(u.getName())
                        .lastname(u.getLastname())
                        .token("").build()

        );
    }

}
