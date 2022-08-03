package com.sistemabancario.exchangerate.service.impl;

import com.sistemabancario.exchangerate.domain.ExchangeRate;
import com.sistemabancario.exchangerate.repository.IExchangeRateRepository;
import com.sistemabancario.exchangerate.service.IExchangeRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ExchangeRateService implements IExchangeRateService {

    @Autowired
    private IExchangeRateRepository exchangeRateRepository;
    @Override
    public Flux<ExchangeRate> findAll() {
        return exchangeRateRepository.findAll();
    }

    @Override
    public Mono<ExchangeRate> findById(String id) {
        return exchangeRateRepository.findById(id);
    }

    @Override
    public Mono<ExchangeRate> save(ExchangeRate exchangeRate) {
        return exchangeRateRepository.save(exchangeRate);
    }

    @Override
    public Mono<ExchangeRate> update(ExchangeRate exchangeRate) {
        return exchangeRateRepository.save(exchangeRate);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return exchangeRateRepository.deleteById(id);
    }
}
