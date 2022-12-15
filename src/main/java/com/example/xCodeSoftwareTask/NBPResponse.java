package com.example;

import java.time.LocalDate;

public class NBPResponse {
    private String table;
    private String no;
    private LocalDate effectiveDate;
    private Rate[] rates;

    public String getTable() { return table; }
    public void setTable(String value) { this.table = value; }

    public String getNo() { return no; }
    public void setNo(String value) { this.no = value; }

    public LocalDate getEffectiveDate() { return effectiveDate; }
    public void setEffectiveDate(LocalDate value) { this.effectiveDate = value; }

    public Rate[] getRates() { return rates; }
    public void setRates(Rate[] value) { this.rates = value; }

    public class Rate {
        private String currency;
        private String code;
        private double mid;
    
        public String getCurrency() { return currency; }
        public void setCurrency(String value) { this.currency = value; }
    
        public String getCode() { return code; }
        public void setCode(String value) { this.code = value; }
    
        public double getMid() { return mid; }
        public void setMid(double value) { this.mid = value; }
    }
}
