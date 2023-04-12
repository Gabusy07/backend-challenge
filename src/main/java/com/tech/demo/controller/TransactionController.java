package com.tech.demo.controller;

import com.tech.demo.document.Transaction;
import com.tech.demo.service.ITransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/transaction")
@CrossOrigin(origins="${client_url}")
public class TransactionController {
    private final ITransactionService transactionService;

    @GetMapping("/{creditCardId}")
    public ResponseEntity<Mono<Transaction>> getLastTransaction(@PathVariable  String creditCardId){
        return new ResponseEntity<>(transactionService.getLastTransaction(creditCardId), HttpStatus.OK);

    }
}
