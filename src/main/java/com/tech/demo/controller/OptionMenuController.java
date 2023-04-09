package com.tech.demo.controller;

import com.tech.demo.document.OptionsMenu;
import com.tech.demo.repository.IOptionMenuRepository;
import com.tech.demo.service.IOptionMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping("/menu")
public class OptionMenuController {
    private final IOptionMenuService optionMenuService;

    @GetMapping
    public ResponseEntity<Flux<OptionsMenu>> getOptions(){
        return new ResponseEntity<>(optionMenuService.getAllOptions(), HttpStatus.OK);
    }
}
