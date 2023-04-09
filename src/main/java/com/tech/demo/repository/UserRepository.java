package com.tech.demo.repository;

import com.tech.demo.document.User;
import com.tech.demo.dto.UserResponse;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
    Mono<User> findUserByEmail(String email);
    Mono<User> save(User user);

}
