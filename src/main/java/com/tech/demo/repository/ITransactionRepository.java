package com.tech.demo.repository;

import com.tech.demo.document.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ITransactionRepository extends ReactiveMongoRepository<Transaction, String> {
    Flux<Transaction> findByCreditCardId(String creditCardId);
    Mono<Transaction> findFirstByCreditCardIdOrderByCreatedAtDesc(String creditCardId);
}
