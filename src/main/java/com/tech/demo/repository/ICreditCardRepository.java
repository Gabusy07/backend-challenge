package com.tech.demo.repository;

import com.tech.demo.document.CreditCard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICreditCardRepository extends ReactiveMongoRepository<CreditCard, String> {
}
