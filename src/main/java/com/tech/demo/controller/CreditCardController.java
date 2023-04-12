package com.tech.demo.controller;

import com.tech.demo.document.CreditCard;
import com.tech.demo.service.ICreditCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/credit-card")
@CrossOrigin(origins="${client}")
public class CreditCardController {

    private final ICreditCardService creditCardService;

    @GetMapping("/{id}")
    public ResponseEntity<Flux<CreditCard>>getCreditCardById() {
        return new ResponseEntity<>(creditCardService.getAllCreditCards(), HttpStatus.OK);
    }
}
