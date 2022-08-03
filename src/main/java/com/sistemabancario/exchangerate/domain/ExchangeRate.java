package com.sistemabancario.exchangerate.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
@Document("exchangerate")
public class ExchangeRate {
    @Id
    private String id;
    private String name;
    private Double buy;
    private Double sale;

}
