package com.tech.demo.service;

import com.tech.demo.document.Transaction;
import com.tech.demo.repository.ITransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements ITransactionService {

    private final ITransactionRepository transactionRepository;


    @Override
    public Mono<Transaction> getLastTransaction(String creditCardId) {
        return transactionRepository.findFirstByCreditCardIdOrderByCreatedAtDesc(creditCardId);
    }
}
