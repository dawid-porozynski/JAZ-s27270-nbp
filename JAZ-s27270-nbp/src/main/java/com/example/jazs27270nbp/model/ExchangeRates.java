package com.example.jazs27270nbp.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
public class ExchangeRates {


    public ExchangeRates(String currency, double averageRate, LocalDateTime dateTime, LocalDate startDate, LocalDate endDate) {
        this.currency = currency;
        this.averageRate = averageRate;
        this.dateTime = dateTime;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String currency;
    @Column
    private double averageRate;
    @Column
    private LocalDateTime dateTime;
    @Column
    private LocalDate startDate;
    @Column
    private LocalDate endDate;

    public Long getId() {
        return id;
    }

    public String getCurrency() {
        return currency;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public ExchangeRates() {

    }
}
