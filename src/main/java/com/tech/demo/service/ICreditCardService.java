package com.tech.demo.service;

import com.tech.demo.document.CreditCard;
import reactor.core.publisher.Flux;

public interface ICreditCardService {
    public Flux<CreditCard> getAllCreditCards();
}
