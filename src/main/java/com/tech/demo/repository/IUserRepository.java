package com.tech.demo.repository;

import com.tech.demo.document.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;


@Repository
public interface IUserRepository extends ReactiveMongoRepository<User, String> {
    Mono<User> findByEmail(String email);

}
