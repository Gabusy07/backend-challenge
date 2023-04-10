package com.tech.demo.service;

import com.tech.demo.document.User;
import com.tech.demo.dto.UserResponse;
import com.tech.demo.dto.UserToRegister;

import com.tech.demo.exception.ResourceAlreadyExistsException;
import com.tech.demo.exception.ResourceNotFoundException;
import com.tech.demo.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;
    private final ReactiveMongoTemplate reactiveMongoTemplate;


    @Override
    public Mono<UserResponse> getUserByUsername(String username) {
        Mono<User> u = userRepository.findByEmail(username)
                .switchIfEmpty(Mono.error(new ResourceNotFoundException("the user with username "+username+ " has not been found")));

        return u.map(user -> UserResponse.builder()
                        .id(user.getId())
                        .email(user.getEmail())
                        .name(user.getName())
                        .token("").build()
                );
    }


    @Override
    public Mono<Object> registerUser(UserToRegister userToRegister) throws ResourceAlreadyExistsException {


        User user = User.builder()
                .name(userToRegister.getName())
                .email(userToRegister.getEmail())
                .password(userToRegister.getPassword())
                .build();

        return reactiveMongoTemplate.findOne(Query.query(Criteria.where("email").is(userToRegister.getEmail())), User.class)
                .flatMap(existingUser -> Mono.error(new ResourceAlreadyExistsException("El email ya está registrado")))
                .switchIfEmpty(Mono.defer(() -> {
                    return reactiveMongoTemplate.save(user)
                            .map(u -> UserResponse.builder()
                                    .id(u.getId())
                                    .email(u.getEmail())
                                    .name(u.getName())
                                    .token("").build()
                            );
                }));


    }

}
