package com.example.jazs27270nbp.service;

import com.example.jazs27270nbp.client.Clientnbp;
import com.example.jazs27270nbp.repository.ExchangeRatesPerPeriodRepository;
import org.springframework.stereotype.Service;

@Service
public class NbpService {
    private final Clientnbp clientnbp;
    private final ExchangeRatesPerPeriodRepository exchangeRatesPerPeriodRepository;



    public NbpService(Clientnbp clientnbp,ExchangeRatesPerPeriodRepository exchangeRatesPerPeriodRepository) {
        this.clientnbp = clientnbp;
        this.exchangeRatesPerPeriodRepository = exchangeRatesPerPeriodRepository;
    }
}
