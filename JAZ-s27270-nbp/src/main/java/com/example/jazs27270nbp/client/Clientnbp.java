package com.example.jazs27270nbp.client;


import com.example.jazs27270nbp.model.NbpModel;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class Clientnbp {
    private final String baseUrl = "http://api.nbp.pl/api/";
    private final RestTemplate restTemplate;

    public Clientnbp(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public NbpModel getExchangeRates(String currencyCode, LocalDate startDate, LocalDate endDate) {
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String url = this.baseUrl + "exchangerates/rates/a/" + currencyCode + "/" + startDate.format(formatters) + "/" + endDate.format(formatters);
        return restTemplate.getForObject(url, NbpModel.class);
    }


}
