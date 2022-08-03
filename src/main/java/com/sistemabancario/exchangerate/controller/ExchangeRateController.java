package com.sistemabancario.exchangerate.controller;

import com.sistemabancario.exchangerate.domain.ExchangeRate;
import com.sistemabancario.exchangerate.service.IExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/exchangerate")
public class ExchangeRateController {

    @Autowired
    private IExchangeRateService iExchangeRateService;

    @GetMapping
    public Flux<ExchangeRate> findAll() {
        return iExchangeRateService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<ExchangeRate> findById(String id) {
        return iExchangeRateService.findById(id);
    }

    @PostMapping
    public Mono<ExchangeRate> save(ExchangeRate exchangeRate) {
        return iExchangeRateService.save(exchangeRate);
    }

    @PutMapping
    public Mono<ExchangeRate> update(ExchangeRate exchangeRate) {
        return iExchangeRateService.save(exchangeRate);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(String id) {
        return iExchangeRateService.deleteById(id);
    }
}
