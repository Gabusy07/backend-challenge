package com.tech.demo.service;

import com.tech.demo.document.Transaction;
import reactor.core.publisher.Mono;

public interface ITransactionService {
    public Mono<Transaction> getLastTransaction(String creditCardId);
}
