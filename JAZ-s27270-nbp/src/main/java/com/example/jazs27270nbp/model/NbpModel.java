package com.example.jazs27270nbp.model;


import java.util.ArrayList;
import java.util.List;

public class NbpModel {

    public static class Rate {
        private String no;
        private String Date;
        private double mid;


        public Rate() {

            //
        }


        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public String getEffectiveDate() {
            return Date;
        }

        public void setEffectiveDate(String effectiveDate) {
            this.Date = effectiveDate;
        }

        public double getMid() {
            return mid;
        }

        public void setMid(double mid) {
            this.mid = mid;
        }

    }

    private List<Rate> rates = new ArrayList<>() {
    };
    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }
    public NbpModel() {
    }

}



