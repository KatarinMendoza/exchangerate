package com.sistemabancario.exchangerate.repository;

import com.sistemabancario.exchangerate.domain.ExchangeRate;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExchangeRateRepository extends ReactiveCrudRepository<ExchangeRate,String> {
}
