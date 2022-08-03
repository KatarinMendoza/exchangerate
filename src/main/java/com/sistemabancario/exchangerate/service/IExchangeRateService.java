package com.sistemabancario.exchangerate.service;

import com.sistemabancario.exchangerate.domain.ExchangeRate;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IExchangeRateService {
    Flux<ExchangeRate> findAll();

    Mono<ExchangeRate> findById(String id);

    Mono<ExchangeRate> save(ExchangeRate client);

    Mono<ExchangeRate> update(ExchangeRate client);

    Mono<Void> deleteById(String id);

}
