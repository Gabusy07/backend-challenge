package com.tech.demo.controller;

import com.tech.demo.document.CreditCard;
import com.tech.demo.service.ICreditCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/credit-card")
public class CreditCardController {

    private final ICreditCardService creditCardService;

    @GetMapping("/{id}")
    public ResponseEntity<Flux<CreditCard>>getCreditCardById() {
        return new ResponseEntity<>(creditCardService.getAllCreditCards(), HttpStatus.OK);
    }
}
