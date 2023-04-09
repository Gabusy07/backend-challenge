package com.tech.demo.service;

import com.tech.demo.document.OptionsMenu;
import com.tech.demo.repository.IOptionMenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


@Service
@RequiredArgsConstructor
public class OptionMenuServiceImpl implements IOptionMenuService{

    private final IOptionMenuRepository optionMenuRepository;

    @Override
    public Flux<OptionsMenu> getAllOptions() {
        return optionMenuRepository.findAll();
    }
}
