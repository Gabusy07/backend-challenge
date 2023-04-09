package com.tech.demo.service;

import com.tech.demo.document.CreditCard;
import com.tech.demo.repository.ICreditCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


@Service
@RequiredArgsConstructor
public class CreditCardServiceImpl implements ICreditCardService{

    private final ICreditCardRepository creditCardRepository;

    @Override
    public Flux<CreditCard> getAllCreditCards() {
        return creditCardRepository.findAll();
    }
}
