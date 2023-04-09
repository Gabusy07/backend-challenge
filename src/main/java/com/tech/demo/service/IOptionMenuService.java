package com.tech.demo.service;

import com.tech.demo.document.CreditCard;
import com.tech.demo.document.OptionsMenu;
import reactor.core.publisher.Flux;

public interface IOptionMenuService {
    public Flux<OptionsMenu> getAllOptions();
}
