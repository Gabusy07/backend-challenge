package com.tech.demo.controller;

import com.tech.demo.document.Transaction;
import com.tech.demo.service.ITransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/transaction")
public class TransactionController {
    private final ITransactionService transactionService;

    @GetMapping("/{creditCardId}")
    public ResponseEntity<Mono<Transaction>> getLastTransaction(@PathVariable  String creditCardId){
        return new ResponseEntity<>(transactionService.getLastTransaction(creditCardId), HttpStatus.OK);

    }
}
